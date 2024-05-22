package com.annotationWithConfigureClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		//üsünte component anotasyonu bulunanı çalıştırır
		Calisan calisan = context.getBean("calisan",Calisan.class);
		
		calisan.run();
	}

}
