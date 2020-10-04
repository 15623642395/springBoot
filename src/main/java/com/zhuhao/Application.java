package com.zhuhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口，主启动类
 * 将扫描该类所在包，及该包下的所有包中的所有类
 * 1、本工程除了演示springboot还演示nginx
 * 2、nginx的演示查看类/springBoot/src/main/java/com/zhuhao/controller/UserController.java
 * 3、使用springboot整合mybatis
 * 4、详细访问详见：/springBoot/src/main/java/com/zhuhao/controller/UserController.java
 * @author 56525
 *
 */
// 在整合mybatis时这个不要加，会启动报错(exclude = { DataSourceAutoConfiguration.class,
// HibernateJpaAutoConfiguration.class })
@SpringBootApplication // (exclude = { DataSourceAutoConfiguration.class,
						// HibernateJpaAutoConfiguration.class })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
