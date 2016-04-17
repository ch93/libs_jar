package com.ch.log;


import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;

/**
 * Log4j的使用用具
 * 
 * @author: ch
 * @date:2016年4月16日 下午2:06:43
 * 
 */
public class LogUtil {
	
    /**
     * 动态修改log文件名
     * @param filename
     * @return 
     */
	 public static void SetLogFileName(String filename){
		 RollingFileAppender appender = (RollingFileAppender)Logger.getRootLogger().getAppender("logfile");
		 appender.setFile( "log/"+filename+".log");//动态地修改这个文件名 
		 appender.activateOptions();
	 }
}
