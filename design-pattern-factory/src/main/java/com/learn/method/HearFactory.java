package com.learn.method;

import com.learn.util.PropertiesUtil;

import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 发型工厂
 *
 * @author wuww
 * @version 1.0
 */
public class HearFactory {

    public static HearInterface createByKey(String key) {

        if ("right".equals(key)) {
            return new RightHearInterface();
        } else if ("left".equals(key)) {
            return new LeftHearInterface();
        }
        return null;
    }

    public static HearInterface createByClass(String className) {
        try {
            HearInterface hear = (HearInterface) Class.forName(className).newInstance();
            return hear;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static HearInterface createByClassKey(String classNameKey) throws FileNotFoundException {
        Properties readProperties = PropertiesUtil.readProperties("/factory.properties");
        try {
            HearInterface hear = (HearInterface) Class.forName(readProperties.getProperty(classNameKey)).newInstance();
            return hear;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
