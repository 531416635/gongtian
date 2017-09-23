package com.yao.util;

import java.util.Properties;

/**
 * 配置文件
 * Description:
 * @author yaoyuxiao 
 * 创建时间：2017年9月23日 上午9:29:28
 */
public class ConfUtil {

    private static Properties properties = new Properties( );

    static {
        try {
            // 加载配置文件
            System.out.println(ConfUtil.class.getResource( "/" ) );
            properties.load( ConfUtil.class.getClassLoader( ).getResourceAsStream(
                    "config.properties" ) );
        } catch ( Exception e ) {
            e.printStackTrace( );
            throw new RuntimeException( e );
        }
    }

    /**
     * 分页大小
     */
    public static int getPageSize( ) {
        return Integer.parseInt(properties.getProperty( "pageSize"));
    }



}
