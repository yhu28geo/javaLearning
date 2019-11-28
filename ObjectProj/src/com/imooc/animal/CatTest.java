package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		// 对象实例化
		Cat one = new Cat();
		Cat two = new Cat("Emma");
		//test
		one.eat();
		one.run();
		one.name = "hua";
		one.month = 2;
		one.weight = 1000;
		one.species = "英短";
		
		int[] arr001 = {1,3,4,9,5};
		int[] arr002 = arr001;
		
		two.month = 5;
		two.weight = 1000;
		two.species = "Presian";
		System.out.println(one.month);
		System.out.println("nickname: " + one.name);
		System.out.println("age: " + one.month);
		System.out.println("weight: " + one.weight);
		System.out.println("species: " + one.species);
		one.run(one.name);
		System.out.println("**********************");
		System.out.println(two.month);
		System.out.println("nickname: " + two.name);
		System.out.println("age: " + two.month);
		System.out.println("weight: " + two.weight);
		System.out.println("species: " + two.species);
		one.run(two.name);
		for (int i=0;i<arr001.length;i++) {
			arr001[i]++;
		}

		System.out.print("arr001: ");
		for(int n:arr001) {
			System.out.print(n+" ");
		}
		System.out.print("arr002: ");
		for(int n:arr002) {
			System.out.print(n+" ");
		}
	}

}
