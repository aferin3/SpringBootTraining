package com.annotationWithConfigureClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  // configürasyon dosyası olduğunu belirtiyoruz
@ComponentScan("com.annotationWithConfigureClass") // hangi pakette tarama yapmasını istiyoruz
@PropertySource("classpath:values.properties")  // hangi dosyadan verileri çekeceğimizi belirtiyoruz.
public class AnnotationConfig {

    @Bean
    public Calisan calisan2(){   //calisan iki adında bir bean oluşturduk ve worker ekledik
        return new Worker();
    }

}
