package com.lara.coding.designpatterns.iterator;

import java.util.Iterator;

public class MyIterator {
	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		Iterator<MenuItem> iterator = dinerMenu.createIterator();
		
		while (iterator.hasNext()) {
			MenuItem menuItem =  iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			
		}
	}
}
