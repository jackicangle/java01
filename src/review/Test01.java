package review;

class Student{
	final String name = "J-king" ;
	public void introduce(){
		System.out.println("I am a student!My name is "+name);
		System.out.println("--------------------");
	}
}

public class Test01 {
	public static void main(String[] args){
		
		Student stu = new Student();
		stu.introduce();
		
		Animal xdog = new Animal();
		xdog.show();
		
		Dog ddog = new Dog();
		ddog.show();
	}

}
class Animal{
	String name;
	public Animal(){
		name = "狗爸爸";
	}
	void show(){
		System.out.println("父类输出名为:"+name);
	}
}
class Dog extends Animal{
	String name;
	int age;
	public Dog(){
		name = "狗儿子";
		age = 2;
	}
	void show(){
		System.out.println("子类输出名为："+name+",年龄为:"+age);
	}
}
