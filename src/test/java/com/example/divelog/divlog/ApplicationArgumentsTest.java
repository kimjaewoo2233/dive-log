package com.example.divelog.divlog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(args = {"--app.name=dive-log-test"})    //여기서 등록
public class ApplicationArgumentsTest {

    @Test
    void testApplicationArguments(@Autowired ApplicationArguments arguments){ //스프링빈으로 등록되고 사용된다
        assertThat(arguments.getOptionNames());
    }
}
