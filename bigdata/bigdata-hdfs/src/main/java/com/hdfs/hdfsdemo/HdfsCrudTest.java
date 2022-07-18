package com.hdfs.hdfsdemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * @author LBS59
 * @descriotion 测试连接
 */
public class HdfsCrudTest {
    FileSystem fs = null;

    @Before
    public void init() throws IOException {
        // 1.构建一个配置参数对象，设置一个参数，即我们需要访问的hdfs的URI
        Configuration conf = new Configuration();
        // 2.这里指定使用的是hdfs文件系统
        conf.set("fs.defaultFS", "hdfs://node1:8020");
        // 3.通过如下的方式进行客户端身份的设置
        System.setProperty("HADOOP_USER_NAME", "root");
        // 4.通过FileSystem的静态方法获取文件系统客户端对象
        fs = FileSystem.get(conf);
    }

    /**
     * 向hdfs集群添加文件
     * @throws IOException io异常抛出
     */
    @Test
    public void testAddFileToHdfs() throws IOException {
        // 1.要上传文件的本地目录
        Path src = new Path("D:/test.txt");
        // 2.要上传到hdfs的目标路径
        Path dst = new Path("/data");
        // 3.上传操作
        fs.copyFromLocalFile(src, dst);
        // 4.关闭资源
        fs.close();
    }

    /**
     * 删除hdfs集群目录或文件
     * @throws IOException io异常
     */
    @Test
    public void testDeleteFileFromHdfs() throws IOException {
        Path path = new Path("/a");
        fs.delete(path, true);
    }

    /**
     * 创建目录或重命名文件/目录
     * @throws IOException io异常
     */
    @Test
    public void testMkdirOrRenameToHdfs() throws IOException {
        fs.mkdirs(new Path("/a/b/c"));
        fs.mkdirs(new Path("/a1/b1/c1"));
        fs.rename(new Path("/a"), new Path("/a3"));
    }

    /**
     * 获取文件列表
     * @throws IOException io异常
     */
    @Test
    public void testGetFileList() throws IOException {
        // 1.过去迭代器对象
        RemoteIterator<LocatedFileStatus> listFiles = fs.listFiles(new Path("/"), true);
        while (listFiles.hasNext()) {
            LocatedFileStatus fileStatus = listFiles.next();
            // 文件名
            System.out.println(fileStatus.getPath().getName());
            // 文件块大小
            System.out.println(fileStatus.getBlockSize());
            // 文件权限
            System.out.println(fileStatus.getPermission());
            // 文件内容权限
            System.out.println(fileStatus.getLen());
            // 文件块信息
            BlockLocation[] blockLocations = fileStatus.getBlockLocations();
            for (BlockLocation bl : blockLocations) {
                System.out.println("bl - len: " + bl.getLength()
                + "--"
                + "bl - offset" + bl.getOffset());
                String[] hosts = bl.getHosts();
                for (String host : hosts) {
                    System.out.println(host);
                }
            }
        }
    }
}
