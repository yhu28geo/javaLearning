package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		// 对象实例化
		Cat one = new Cat();
		//Cat two = new Cat("Emma");
		//test
		one.eat();
		one.run();
		one.setName("huahua");
		one.setMonth(2);
		one.setWeight(1000);
		one.setSpecies("英短");
		
		/*
		 * two.month = 5; two.weight = 1000; two.species = "Presian";
		 */
		System.out.println("nickname: " + one.getName());
		//如果年龄输入错误直接终止执行
		if(one.getMonth()==0) {
			return;
		}
		System.out.println("age: " + one.getMonth());
		System.out.println("weight: " + one.getWeight());
		System.out.println("species: " + one.getSpecies());
		System.out.println("**********************");
		/*
		 * System.out.println(two.month); System.out.println("nickname: " + two.name);
		 * System.out.println("age: " + two.month); System.out.println("weight: " +
		 * two.weight); System.out.println("species: " + two.species);
		 * one.run(two.name);
		 */

	}

}
