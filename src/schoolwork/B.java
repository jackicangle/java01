package schoolwork;

/**
 * 继承
 * @author 金杭云
 * 2020/3/20
 */

class F{
	public int a = 0;
	public void getF(){
		System.out.println("----A----");
	}
}
class Z extends F{
	public int a = 1;
	public void getF(){
		System.out.println("----B----");
	}
}

public class B{
	public static void main(String[] args){
		F f = new Z();
		System.out.println(f.a);
		f.getF();
		
		System.out.println("***********************");
		
		class Book{
			String title;   //书名
			double price;   //价格
			public void getA(){     //输出的方法
				System.out.println("书的名字："+title+"\n价格："+price+"元");
			}
		}
		Book book1 = new Book();
			book1.title = "java程序开发";
			book1.price = 68.8;
			book1.getA();
		Book book2 = new Book();
			book2.title = "C语言程序设计";
			book2.price = 68;
			book2.getA();
			
		System.out.println("***********************");
		
		
	}
	

}
