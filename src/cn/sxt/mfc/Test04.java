package cn.sxt.mfc;

/**
 * Çósum=1!+2!+3!+¡­.+20!
 * factorial--½×³Ë
 * @author 86131
 * 2020/4/11
 */

public class Test04 {
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=20;i++){
			sum += factorial(i);
		}
		System.out.println(sum);
	}
	public static int factorial(int n){
		int x = 1;
		for(int i = n;i>0;i--){
			x *= i;
		}
		return x;
	}
}
