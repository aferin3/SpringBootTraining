package com.annotationWithConfigureClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Worker implements Calisan{
	@Value("${calisan.isim}")
	String name;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + " işçi çalışıyor");
	}

}
