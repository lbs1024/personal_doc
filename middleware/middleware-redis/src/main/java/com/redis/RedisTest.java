package com.redis;

import com.redis.util.Utils;

/**
 * @author lbs
 * @description redis测试
 */
public class RedisTest {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.connects();
        utils.setRedis("key", "helloworld");
        utils.getRedis("key");
    }
}
