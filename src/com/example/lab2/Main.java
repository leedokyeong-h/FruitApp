package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> f1 = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit("apple",1000,101);
		f1.add(s1);
		Fruit s2 = new Fruit("Orange",1500,102);
		f1.add(s2);
		Fruit s3 = new Fruit("Kiwi",2000,103);
		f1.add(s3);
		Fruit s4 = new Fruit("Watermelon",24,104);
		f1.add(s4);
		Fruit s5 = new Fruit("Strawberry",25,105);
		f1.add(s5);
		Fruit s6 = new Fruit("Lemon",28,106);
		f1.add(s6);
		Fruit s7 = new Fruit("Persimmon",29,107);
		f1.add(s7);
		Fruit s8 = new Fruit("Fig",14,108);
		f1.add(s8);
		Fruit s9 = new Fruit("Pear",32,107);
		f1.add(s9);
		Fruit s10 = new Fruit("Peach",50,108);
		f1.add(s10);
		
		Collections.sort( f1, new FruitComparator());
		for (Fruit s : f1) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(f1, new FruitComparatorDesc());
		
		for (int i = 0; i<f1.size();i++) {
			System.out.println(f1.get(i).toString());
		}
	}

}
