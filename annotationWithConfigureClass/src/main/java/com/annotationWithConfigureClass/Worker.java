package com.annotationWithConfigureClass;

import org.springframework.stereotype.Component;


public class Worker implements Calisan{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("işçi çalışıyor");
	}

}
