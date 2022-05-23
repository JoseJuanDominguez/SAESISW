package com.example.ISWProyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
public class IswProyectoApplication {

	public static void main(String[] args) {
		try{   SpringApplication.run(IswProyectoApplication.class, args);

        } catch (Throwable e) {

            e.printStackTrace();

        }
		
	}

}
