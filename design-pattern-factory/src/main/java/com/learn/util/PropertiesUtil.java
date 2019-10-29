package com.learn.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件的工具类
 *
 * @author wuww
 * @version 1.0
 */
public class PropertiesUtil {

    public static Properties readProperties(String resourceName) throws FileNotFoundException {
        Properties properties = new Properties();
        InputStream inStream = PropertiesUtil.class.getResourceAsStream(resourceName);
        if (inStream == null) {
            throw new FileNotFoundException("读取文件失败" + resourceName);
        }
        try {
            properties.load(inStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
