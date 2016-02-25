package org.mvnsearch.jsondoc;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class JsondocBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsondocBootDemoApplication.class, args);
    }
}
