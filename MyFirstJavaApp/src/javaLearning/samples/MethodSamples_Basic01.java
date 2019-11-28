package javaLearning.samples;

public class MethodSamples_Basic01 {
/**
 * 
 * 
 * 
 * 
 * @return 
 * */
	//打印输出星号的方法(无参数无返回值)
	public void printStar(){
		System.out.println("******************");
	}
	
	//求长方形面积的方法(无参有返回）
	public int area() {
		int length = 10;
		int width = 5;
		int get_area = length*width;
		return get_area;
	}
	//求最大值得方法（有参无返回）
	public void max(float a, float b) {
		float max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("两个数"+a+"与"+b+"的最大值为："+max);
	}
	//求n! （有参有返回）
	public int fac(int n){
		int s=1;
		for (int i=1;i<=n;i++) {
			s*=i;
		}
		return s;
	}

	public static void main(String[] args) {
		MethodSamples_Basic01 myMethodDemo= new MethodSamples_Basic01();
		myMethodDemo.printStar();
		int rc_area = myMethodDemo.area();
		System.out.println("面积为：" + rc_area);
		myMethodDemo.max(10.25f, 45.97f);
		int fac = myMethodDemo.fac(3);
		System.out.println("3!="+fac);
	}
	
}
