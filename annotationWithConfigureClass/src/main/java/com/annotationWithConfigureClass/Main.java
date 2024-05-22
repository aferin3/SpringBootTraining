package com.annotationWithConfigureClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		//üsünte component anotasyonu bulunanı çalıştırır
		Calisan calisan = context.getBean("calisan",Calisan.class);
		
		//Bu da configürasyon sınıfında belirttiğimiz bean üzerine çalışıyor
		Calisan calisan2 = context.getBean("calisan2",Calisan.class);
		
		calisan.run();
		calisan2.run();
	}

}
