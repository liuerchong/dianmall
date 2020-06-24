package com.liu.dianmall.fastdfs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhifeng.Zeng
 * @description FastDfs Storage节点配置
 * @date 2019/9/9 14:20
 */
@Component
@ConfigurationProperties(prefix = "fdfs")
public class FdfsGroupsConfig {


    public Map<String, String> getGroupMap() {
        return groupMap;
    }

    public void setGroupMap(Map<String, String> groupMap) {
        this.groupMap = groupMap;
    }

    private Map<String, String> groupMap = new HashMap<>();


}
