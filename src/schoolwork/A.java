package schoolwork;

/**
 * 方法的调用、递归
 * 2020年3月16日    11:44
 */
import java.util.Scanner;
public class A {

	public static void main(String[]args){
		HW();
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(add(a,b));
		System.out.println(subtract(a,b));
		System.out.println("**********************");
		System.out.println(add2(23.4,24.5,26.1));
		System.out.println("**********************");
		System.out.println(Hundred(1));
	}
	public static int Hundred(int sum){
		if(sum == 100)
			return sum;
		return sum + Hundred(sum+1);
	}
	public static void HW(){
		System.out.println("***********************");
		System.out.println("Hello World");
		System.out.println("***********************");
	}
	public static double add2(double x,double y,double z){
		double sum = x + y + z;
		return sum;
	}
	public static int add(int x,int y){
		int sum = x + y;
		return sum;
	}
	public static int subtract(int x,int y){
		int differ;
		if(x>y){
			 differ = x - y;
		}else{
			 differ = y - x;
		}
		return differ;
	}
}
