package com.wonders.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * done:
 *  1.配置输出sql打印日志：https://www.cnblogs.com/kingsonfu/p/9245731.html
 *  2.将日志输出的到指定文件：https://www.cnblogs.com/tiancai/p/8676352.html
 *
 *
 *
 *
 */

/**
 * undo:
 *  1.项目上传到git
 *
 *
 *
 */
@MapperScan("com.wonders.demo.mybatis.mapper")
@SpringBootApplication
public class DemoApplication {

	/**
	 * 整合参考：https://blog.csdn.net/shengshenglalalala/article/details/100576106
	 * @param args
	 */


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
