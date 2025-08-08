package com.nt.main;

import com.nt.sbesns.WishMessageGenerator;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//object class
		/* Object obj=ctx.getBean("wmg"); */
		//type casting
		/* WishMessageGenerator Generator=(WishMessageGenerator)obj */
		/*
		 * String result=Generator.showWishMessageGenerator("Nikhil");
		 * System.out.println(result);
		 */
		WishMessageGenerator wmg = (WishMessageGenerator) ctx.getBean("wmg");

		wmg.setTime(LocalTime.now());
		wmg.setDate( LocalDate.now());
		wmg.setColor("red");
		
		ctx.close();

	}

}
