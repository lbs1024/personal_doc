package com.mapreduce;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * @author LBS59
 * @description mapreduce实现
 */
public class WordCount {
    /**
     * 输入： map阶段的输出 key（Text）一个单词 value（LongWritable） 单词次数 1
     * 输出： key（Text）单词 value（LongWritable） 单词总次数
     */
    public static class WCReducer extends Reducer<Text, LongWritable, Text, LongWritable> {
        private final LongWritable longWritable = new LongWritable(1);

        @Override
        protected void reduce(Text key, Iterable<LongWritable> values,
                              Reducer<Text, LongWritable, Text, LongWritable>.Context context)
                throws IOException, InterruptedException {
            long sum = 0;
            for (LongWritable value : values) {
                sum += value.get();
            }
            longWritable.set(sum);
            // 输出 单词的 和
            context.write(key, longWritable);
        }
    }

    /**
     * 输入： key（LongWritable）一行单词的长度（偏移量） value（Text）一行单词
     * 输出： key（Text）一个单词 value（LongWritable） 单词次数 1
     */
    public static class WCMapper extends Mapper<LongWritable, Text, Text, LongWritable> {
        // 防止对象创建太多
        private final Text text = new Text();
        private final LongWritable longWritable = new LongWritable(1);

        @Override
        protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, LongWritable>.Context context)
                throws IOException, InterruptedException {
            // 获取一行
            String line = value.toString();
            // 空格分割 ,一行单词
            String[] words = line.split(" ");
            for (String word : words) {
                text.set(word);
                // 输出到 hadoop key:一个单词 value:次数 1
                context.write(text, longWritable);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        // 获取job
        Job job = Job.getInstance();
        job.setJarByClass(WordCount.class);
        job.setMapperClass(WCMapper.class);
        job.setReducerClass(WCReducer.class);
        // 设置map输出 key 类型
        job.setMapOutputKeyClass(Text.class);
        // 设置map输出 value 类型
        job.setMapOutputValueClass(LongWritable.class);
        // 输入
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        // 输出
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        // 提交job
        boolean ret = job.waitForCompletion(true);
        System.out.println("单词汇总完毕！ ret:" + ret);
    }
}
