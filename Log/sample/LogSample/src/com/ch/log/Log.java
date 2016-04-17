package com.ch.log;

import org.apache.log4j.Logger;
/**
 * 日志样例
 * 1 加入jar包， log4j-1.2.17.jar
 * 2 加入log配置文件（log4j.properties），放在 src目录下即可
 * 3 编写日志代码
 * @author ch
 *
 */
public class Log {
	
	private Logger log = Logger.getLogger(Log.class);
	
	/**
	 * 
	 */
	public void logInError() {
		log.error("text info ");
		//log.info("text info ");
//		log.debug("text info ");
	}
	
	/**
	 * 更改日志保存的路径 
	 * 日志默认保存在log/error.log 文件中
	 * 
	 */
	public void logChangePath() {
		//更改日志保存的路径 ,使日志存在log/info.log 文件中
		//仅限于当前的这一次，下次如果不调用LogUtil.SetLogFileName("info")，日志会保存到默认的路径中
		LogUtil.SetLogFileName("info");
		log.error("text info");
		
	}
	
	
	public static void main(String[] args) {
		Log log1 = new Log();
		log1.logInError();
		log1.logChangePath();
		
	}
	
	

	
	
	
	
	

}
