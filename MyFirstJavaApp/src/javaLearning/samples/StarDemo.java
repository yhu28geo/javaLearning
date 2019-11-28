/**
 * 
 */
package javaLearning.samples;

/**
 * @author hyy19
 *
 */
public class StarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输出星号组成的梯形
		int sum=0, ji=1;
				for (int n=1; n<=5; n++){
					System.out.print("Line:"+n);
				    for (int i=6-n; i>=1; i--){
				    	sum=sum+i+n;
				        System.out.print("  ");
				    }
				    for (int j=2*n+1; j>=1; j--){
				        ji=j*n;
				    	System.out.print("* ");
				    }
				    System.out.println("\n");
				}

	}

}
