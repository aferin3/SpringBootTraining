package com.annotationWithConfigureClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("calisan")
public class Manager implements Calisan {

	@Value("${calisan.isim}")
	String name;
	
	
	@Override
	public void run() {
		System.out.println(name +" Müdür Çalışıyor");
		
	}
}
