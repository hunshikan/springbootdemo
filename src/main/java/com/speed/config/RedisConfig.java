package com.speed.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liupengtao on 2017/8/13.
 */
@Configuration
public class RedisConfig {

    //注入集群节点信息
    @Value("${spring.redis.cluster.nodes}")
    private  String clusterNodes;

    @Bean
    public JedisCluster getJedisCluster(){

         //分割集群节点
        String[] cNodes=clusterNodes.split(",");

        //创建set集合对象
        Set<HostAndPort> nodes=new HashSet<HostAndPort>();

        //循环集群节点对象
        for (String node:cNodes) {
            String[] hp=node.split(":");
            nodes.add(new HostAndPort(hp[0],Integer.parseInt(hp[1])));
        }

         //创建redis集群随想
        JedisCluster jedisCluster=new JedisCluster(nodes);
         return jedisCluster;
    }
}
