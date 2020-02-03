package com.river.netty.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author river
 * 2020/02/02
 */
public class PropertiesUtil {

    private static final Properties properties = new Properties();

    private static final String CONFIG_FILE_PATH = "netty.properties";

    public static String getValue(String key) {
        try {
            properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(CONFIG_FILE_PATH));
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
