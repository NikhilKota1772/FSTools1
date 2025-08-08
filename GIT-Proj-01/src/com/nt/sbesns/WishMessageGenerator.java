package com.nt.sbesns;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {

 
	 private LocalTime time;
	 private LocalDate date;
	 private String color;

public WishMessageGenerator() {
	System.out.println("WishMessageGenerator.showWishMessage()::0-param constructor");
	
}

public LocalTime getTime() {
	return time;
}

public void setTime(LocalTime time) {
	this.time = time;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

//method
public String showWishMessage(String name) {
    String greeting;

    int hour = time.getHour();

    if (hour < 12) greeting = "Good Morning";
    else if (hour < 16) greeting = "Good Afternoon";
    else if (hour < 20) greeting = "Good Evening";
    else greeting = "Good Night";

    return String.format(
        "%s, %s!\nToday is %s\nCurrent time: %s\nTheme color: %s",
        greeting, name, date, time, color
    );
}
	
}