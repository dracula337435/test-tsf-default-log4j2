package io.dracula.test.tsf.defaults.log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guanxk
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

}
