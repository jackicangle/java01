package schoolwork;

/**
 * 水仙花数：三位数，每个位上数字的3次幂之和等于他本身   如：1^3+5^3+3^3=153
 * @author 金杭云
 *
 */

public class NarcissisticNumber {
	public static void main(String[]args){
		int a,b,c;
		for(int i=100;i<1000;i++){
			a = i/100;
			b = i/10%10;
			c = i%10;
			if((a*a*a+b*b*b+c*c*c)==i){
				System.out.println(i);
			}
		}
	}

}
