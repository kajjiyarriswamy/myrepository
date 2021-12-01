package com.technoelevate.grocery.add.cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GroceryShoppingCart {

	static ArrayList groceryitems = new ArrayList(5);
	static Scanner s = new Scanner(System.in);

	public void addItems() {
		this.groceryitems.add(s.next());

	}

	public void viewAllItems() {
		for (Object obj : groceryitems) {
			System.out.println(obj);
		}

	}

	public void setItem(int index, Object obj) {
		this.groceryitems.set(index, obj);
	}

	public void removeItems(int index) {
		this.groceryitems.remove(index);
	}

	public void display() {
		if (groceryitems.size() > 0) {
			viewAllItems();
		}
	}

	public Object get(int index) {
		return groceryitems;
	}

	public static void main(String[] args) {
		GroceryShoppingCart g = new GroceryShoppingCart();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		switch (num) {
		case 1:
			System.out.println("-------Add the elements----------");
			for(int j=0;j<groceryitems.size();j++) {
			g.addItems();
			continue;
			}
			break;
		case 2:
			System.out.println("-----The list of groceryitems are------");
			g.viewAllItems();
			break;
		case 3:
			g.removeItems(i);
			g.display();
			System.out.println("--------After Removing the Elements------ ");
			break;
		case 4:
			System.out.println("-----Dispalay Element is---------");
			g.get(i);

		case 5:
			System.out.println("------The Elements are--------");
			g.display();

		}
	}
}