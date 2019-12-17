package com.chainup.common.mybatis;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Intercepts({ @Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }), @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class }) })
public class MybatisInterceptor implements Interceptor {
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	private Properties properties;
	
	/**
	 * 该字段与正常意义的Logger定义不同。为了方便所有日志都是以ERROR打印的，通过不同的等级决定是否打印输出
	 * debug：打印所有执行的sql语句，此时solw_query_time字段视为无效  
	 * info：只打印小于solw_query_time值的sql
	 * off：所有语句不打印
	 */
	private String log_level = "debug";
	
	/**
	 * 单位为毫秒ms
	 */
	private int slow_query_time= 1;
	
	
	public MybatisInterceptor(){
		
	}
	
	public MybatisInterceptor(String log_level,int slow_query_time){
		this.log_level = log_level;
		this.slow_query_time = slow_query_time;
	}

	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
		Object parameter = null;
		if (invocation.getArgs().length > 1) {
			parameter = invocation.getArgs()[1];
		}
		String sqlId = mappedStatement.getId();
		BoundSql boundSql = mappedStatement.getBoundSql(parameter);
		Configuration configuration = mappedStatement.getConfiguration();
		Object returnValue = null;
		long start = System.currentTimeMillis();
		try {
			returnValue = invocation.proceed();
		} catch (Exception e) {
			logger.error(e.getCause().toString());
		}
		
		long end = System.currentTimeMillis();
		long time = (end - start);
		
		if(log_level.equalsIgnoreCase("debug")){
			logger.info(getSql(configuration, boundSql, sqlId, time));
		}else if(log_level.equalsIgnoreCase("info")){
			if(time>slow_query_time){
				logger.info(getSql(configuration, boundSql, sqlId, time));
			}
		}else if(log_level.equalsIgnoreCase("off")){

		}
		return returnValue;
	}

	public static String getSql(Configuration configuration, BoundSql boundSql, String sqlId, long time) {
		String sql = showSql(configuration, boundSql);
		StringBuilder str = new StringBuilder(100);
		str.append(sqlId);
		str.append(":");
		str.append(sql);
		str.append(":");
		str.append(time);
		str.append("ms");
		return str.toString();
	}

	private static String getParameterValue(Object obj) {
		String value = null;
		if (obj instanceof String) {
			value = "'" + obj.toString() + "'";
		} else if (obj instanceof Date) {
			DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.CHINA);
			value = "'" + formatter.format(new Date()) + "'";
		} else {
			if (obj != null) {
				value = obj.toString();
			} else {
				value = "";
			}
		}
		return value;
	}

	public static String showSql(Configuration configuration, BoundSql boundSql) {
//		Object parameterObject = boundSql.getParameterObject();
//		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
//		String sql = boundSql.getSql().replaceAll("[\\s]+", " ");
//		if (parameterMappings.size() > 0 && parameterObject != null) {
//			TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
//			if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
//				sql = sql.replaceFirst("\\?", getParameterValue(parameterObject));
//
//			} else {
//				MetaObject metaObject = configuration.newMetaObject(parameterObject);
//				for (ParameterMapping parameterMapping : parameterMappings) {
//					String propertyName = parameterMapping.getProperty();
//					if (metaObject.hasGetter(propertyName)) {
//						Object obj = metaObject.getValue(propertyName);
//						sql = sql.replaceFirst("\\?", getParameterValue(obj));
//					} else if (boundSql.hasAdditionalParameter(propertyName)) {
//						Object obj = boundSql.getAdditionalParameter(propertyName);
//						sql = sql.replaceFirst("\\?", getParameterValue(obj));
//					}
//				}
//			}
//		}
//		return sql;
		return "";
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties0) {
		this.properties = properties0;
	}
	
}