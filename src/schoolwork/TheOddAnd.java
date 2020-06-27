package schoolwork;

/**
 * 0-100的奇数和   偶数和   3的倍数和   5的倍数和
 * @author 金杭云
 *
 */
public class TheOddAnd {
	public static void main(String[]args){
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0,sum4 = 0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum1 += i;
			}else{
				sum2 += i;
			}
			if(i%3==0)
				sum3 += i;
			if(i%5==0)
				sum4 +=i;
		}
		System.out.println("奇数和为"+sum1+"\n偶数和为："+sum2);
		System.out.println("3的倍数和："+sum3+"\n5的倍数和："+sum4);
		
	}
}
