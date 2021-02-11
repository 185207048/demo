package cn.manag.myManager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.manag.myManager.mapper")
public class MyManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyManagerApplication.class, args);
	}

}
