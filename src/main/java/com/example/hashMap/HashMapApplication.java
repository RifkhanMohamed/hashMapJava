package com.example.hashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class HashMapApplication {

	public static void main(String[] args) {
		HashMap<String,Integer> temp=new HashMap<>();
		temp.put("John",123);
		temp.put("Marry",124);
		temp.put("Carlos",125);
		System.out.println(temp);
		System.out.println(temp.get("John"));
		System.out.println(temp.containsKey("Marry1"));
		System.out.println(temp.containsValue(123));
		temp.putIfAbsent("Marry1",126);
		System.out.println(temp);
		temp.replace("Marry",1);
		System.out.println(temp);
		temp.remove("Marry1");
		System.out.println(temp);
	}

}
