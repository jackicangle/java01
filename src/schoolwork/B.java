package schoolwork;

/**
 * �̳�
 * @author ����
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
			String title;   //����
			double price;   //�۸�
			public void getA(){     //����ķ���
				System.out.println("������֣�"+title+"\n�۸�"+price+"Ԫ");
			}
		}
		Book book1 = new Book();
			book1.title = "java���򿪷�";
			book1.price = 68.8;
			book1.getA();
		Book book2 = new Book();
			book2.title = "C���Գ������";
			book2.price = 68;
			book2.getA();
			
		System.out.println("***********************");
		
		
	}
	

}
