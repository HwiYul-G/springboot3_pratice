package me.student.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication 애너테이션을 추가해서 스프링 부트 사용에 필요한 기본 설정을 해줌
@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args){
        // 애플리케이션을 수행함 1번 arg : 스프링 부트 3 애플리케이션의 메인 클래스로 사용할 클래서, 2arg : 커맨드 라인의 인수들 전달
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
