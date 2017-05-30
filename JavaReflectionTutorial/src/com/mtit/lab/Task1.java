package com.mtit.lab;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task1 {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("com.mtit.lab.Task1");
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getName());
			System.out.println(clazz.getPackage());
			System.out.println(clazz.getModifiers());
			System.out.println(clazz.getDeclaredMethod("main", String[].class));
			System.out.println(Modifier.toString(clazz.getDeclaredMethod(
			"main", String[].class).getModifiers()));
			
			printBook();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalArgumentException | NoSuchFieldException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testMethod(){
		System.out.println("This is a test method invoked by reflection");
	}
	
	public static void printBook() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException{
		Class<?> clazz = Class.forName("com.mtit.lab.Book");
		Field privateField = clazz.getDeclaredField("bookName");
		privateField.setAccessible(true);
		Field[] fields = clazz.getFields();
		System.out.println(clazz.getConstructor(null));
		System.out.println(privateField.getName()+ " = " + privateField.get(new Book()));
		System.out.println(fields[0].getName()+ " = " + fields[0].getInt(new Book()));
//
//		Object[] array = new Object[Array.getLength(fields[1].get(new Book()))];
//		
		System.out.println();
		
		System.out.println(fields[2].getName()+ " = " + fields[2].getDouble(new Book()));
	}

}
