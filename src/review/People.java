package review;

/**
 * 1利用多态性编程：
 *		  （1）创建一个People类，在类中声明姓名、年龄、联系电话等必要的成员变量，
 *			  实现设置姓名、年龄、联系电话和获取姓名、年龄、联系电话等必要的方法，并实现显示People整体信息的方法；
 * 		  （2）创建People的子类Student，并根据需要添加必要的成员变量，并以方法覆盖的方式来显示学生信息。
 * 		  （3）实例化一个学生对象，完成对学生信息的设置和显示。
 * @author 86131
 * 2020/4/17
 */


public class People {
	private static String name;
	private static int telephone;
	private static int age;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getTelephone(int telephone){
		return telephone;
	}
	public void setTelephone(){
		this.telephone=telephone;
	}
	public int getAge(int age){
		return age;
	}
	public void setAge(){
		this.age = age;
	}
	public People(String name,int telephone,int age){
		super();
		this.name = name;
		this.telephone = telephone;
		this.age = age;
	}
	public static void main(String[] args){
		
		People a = new People(name,age,telephone);
		a.name = "J-king";
		a.age = 5;
		a.telephone = 1101011;
		System.out.println("姓名："+name+"\n年龄："+age+"\n电话号码："+telephone);
	}
}

