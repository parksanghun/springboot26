package kr.co.sanghun.study.springboot26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.SanitizingFunction;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;

import javax.servlet.http.Cookie;

@SpringBootApplication
public class Springboot26Application {

    public static void main(String[] args) {
//        SpringApplication.run(Springboot26Application.class, args);
        SpringApplication app = new SpringApplication(Springboot26Application.class);
        app.setApplicationStartup(new BufferingApplicationStartup(1000));
        app.run(args);
    }

    @Bean
    public CookieSameSiteSupplier cookieSameSiteSupplier() {
        return CookieSameSiteSupplier.ofStrict().whenHasName("mycookie");
    }

    @Bean
    public SanitizingFunction sanitizingFunction() {
        return data -> data.getPropertySource().getName().equals(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)
                ? data.withValue("this is top secret!") : data;
    }
}
