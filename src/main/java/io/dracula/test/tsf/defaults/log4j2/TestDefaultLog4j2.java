package io.dracula.test.tsf.defaults.log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.tsf.annotation.EnableTsf;

/**
 * @author guanxk
 */
@EnableTsf
@SpringBootApplication
public class TestDefaultLog4j2 {

    public static void main(String[] args){
        SpringApplication.run(TestDefaultLog4j2.class, args);
    }

}
