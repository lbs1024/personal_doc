package com.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * @author LBS59
 * @description 自定义UDF函数
 */
public class ConcatString extends UDF {
    public String evaluate(String str) {
        return str + "!";
    }
}
