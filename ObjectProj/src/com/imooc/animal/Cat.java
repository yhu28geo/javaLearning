package com.imooc.animal;
/**
 * 宠物猫类
 * @author 胡扬阳
 *
 */
public class Cat {
//For ssh testing only
	
	//Attributes
	//修改属性的可见性---private
	private String name;
	private int month;//年龄
	private double weight;//体重
	private String species;//品种
	
	
	
	
	//添加无参构造方法
	public Cat() {
		System.out.println("(无参数)你已创造了一个小猫对象！");
	}
	
	//添加有参构造方法
	
	  public Cat(String name, int month, double weight, String species) { 
	  //构造方法不能被同一类的普通方法调用，但是可以被同一类内其他构造方法调用，这种情况使用this()调用，且必须写在第一行 this.name =
      this();
	  this.setMonth(month); 
	  this.setName(name); 
	  this.setSpecies(species); 
	  this.setWeight(weight);
	  System.out.println("(有参数)你已创造了一个小猫对象！" + name); }
	 
	  {
			System.out.println("我是构造代码块1");
	  }//构造代码块
	  
	  
	  static{
			System.out.println("我是静态代码块A");
	  }//静态代码块
	  
	//创建get/set方法
	//在get和set方法里添加对属性的限定
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "我是一只名叫："+this.name+"的宠物猫";
	}		
			
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=0)
			System.out.println("NOT VALID IMPUT!!!");
		else
			this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
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
