package com.redis.util;

import redis.clients.jedis.Jedis;

/**
 * @author lbs
 * @description 工具类
 */
public class Utils {
    private Jedis jedis;

    public void connects() {
        // 连接本地的Redis服务
        jedis = new Jedis("localhost");
    }

    public void setRedis(String key, String value) {
        jedis.set(key, value);
    }

    public void getRedis(String key) {
        System.out.println("获取: " + jedis.get(key));
    }
}
