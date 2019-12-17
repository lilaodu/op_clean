package com.chainup.common.mybatis;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    //将数据源重置为默认数据源
    public static void changeTodefaultDataSource() {
        dataSourceKey.remove();
    }
//    //院
//    public static void setDataSourceY(){
//        dataSourceKey.remove();
//        dataSourceKey.set("yzhDataSource");
//    }
   
    //将数据源设置为配置文件中key值为dataSource参数对应的值的数据源
    public static void setDataSource(String dataSource){
        dataSourceKey.remove();
        dataSourceKey.set(dataSource);
    }
    
    //获取当前数据源的key值
    public static String getKey(){
        return dataSourceKey.get();
    }
    
    //重写AbstractRoutingDataSource的方法，提供当前的数据源用于连接
    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }

}