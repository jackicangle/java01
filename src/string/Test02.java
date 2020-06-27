package string;

/**
 * I am a good cat,
 * 	 1.大小写互换
 *	 2.第一个a 和最后一个a出现的位置
 *	 3.把cat换成pig
 *	 4.把   abcd   前面两个空格和后面两个空格取消并求出取消前和取消后该字符串的大小
 *	 5.回文串的例子
 * @author 金杭云
 *	2020/4/21
 */

public class Test02 {
	
	public static void main(String[] args){
		String s = "i am a good cat";
		System.out.println("第一个a的位置："+s.indexOf('a')+"\n最后一个a的位置："+s.lastIndexOf('a'));
		System.out.println("输出大小写互换后的字符串："+s.toUpperCase());
		String s2 = s.replace("cat", "dog");
		System.out.println("替换后："+s2);
		
		String s3 = "  abcd  ";
		System.out.println("取消前字符串大小："+s3.length());
		System.out.println("取消后"+s3.trim()+"大小为："+s3.trim().length());
	}

}
