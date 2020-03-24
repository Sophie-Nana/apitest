package com.nanshan.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2020/3/24.
 */
public class BaseTest {
    public static Properties prop;

    //写一个构造函数
    public BaseTest() {

        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
                    "\\src\\main\\resources\\config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
//    }

}
