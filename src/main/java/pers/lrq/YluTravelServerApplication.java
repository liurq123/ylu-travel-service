package pers.lrq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.lrq.mapper")
public class YluTravelServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YluTravelServerApplication.class, args);
    }

}
