package com.annotationWithConfigureClass;

import org.springframework.stereotype.Component;

@Component("calisan")
public class Manager implements Calisan {

	@Override
	public void run() {
		System.out.println("Müdür Çalışıyor");
		
	}
}
