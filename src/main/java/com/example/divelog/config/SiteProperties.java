package com.example.divelog.config;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ToString
@ConfigurationProperties(prefix = "site")
public class SiteProperties {
    private final String authorName;
    private final String authorEmail;

    @ConstructorBinding
    public SiteProperties(String authorName,String authorEmail){
        this.authorName = authorName;
        this.authorEmail =authorEmail;
    }
    /*
    * 그냥 변수랑 yml파일에 선언한 변수랑 이름만 같게한다면 Setter를 사용한 바인딩이다
    * 다른 방법으로는 생성자 바인딩이 있는데 이 방법은 위처럼 @ConstructorBinding을 사용한다
    * Setter가 추가된 Properties는 좋은 방법이아니다 Spring Container에 의해
    *  싱글통으로 관리되는 객체에 변경 가능성이 열려있기 때문이다.
    * 그러므로 해당 클래스의 변수들을 final로 선언하고 생성자로 바인딩하도록 수정하는 것이 좋은 방법이다
    * */
}
