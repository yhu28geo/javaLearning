package com.imooc.animal;
/**
 * 宠物猫类
 * @author 胡扬阳
 *
 */
public class Cat {
//For ssh testing only
	
	//Attributes
	String name;
	int month;//年龄
	double weight;//体重
	String species;//品种
	
	//添加无参构造方法
	public Cat() {
		System.out.println("你已创造了一个小猫对象！");
	}
	
	//添加有参构造方法
	public Cat(String name) {
		this.name = name;
		System.out.println("你已创造了一个小猫对象！" + name);
	}
			
	//Methods
	//跑动的方法
	public void run() {
		System.out.println("Pussy Running");
		
	}
	public void run(String name) {
		System.out.println(name + " running!"); 
	}
	//吃东西的方法
	public void eat() {
		System.out.println("Pussy eating");
	}


}
