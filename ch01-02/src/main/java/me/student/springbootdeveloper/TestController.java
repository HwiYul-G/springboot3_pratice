package me.student.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")    // /test GET 요청이 오면 test()를 실행
    public String test(){
        return "Hello, world!";
    }
}
