package com.learn.abstractfac;

import com.learn.util.PropertiesUtil;

import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 颜色生产工厂
 *
 * @author wuww
 * @version 1.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color createColor(String colorStr) throws FileNotFoundException, ClassNotFoundException {
        Properties properties = PropertiesUtil.readProperties("/factory.properties");
        String className = properties.getProperty(colorStr);
        if (className == null) {
            throw new ClassNotFoundException("没有这种颜色，" + colorStr);
        }
        try {
            return (Color) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Shape createShape(String shapeStr) {
        return null;
    }
}
