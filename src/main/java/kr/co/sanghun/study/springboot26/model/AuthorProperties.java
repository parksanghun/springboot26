package kr.co.sanghun.study.springboot26.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("blogger.author")
public record AuthorProperties(String firstName, String lastName, String email) {
}
