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
		name = "���ְ�";
	}
	void show(){
		System.out.println("���������Ϊ:"+name);
	}
}
class Dog extends Animal{
	String name;
	int age;
	public Dog(){
		name = "������";
		age = 2;
	}
	void show(){
		System.out.println("���������Ϊ��"+name+",����Ϊ:"+age);
	}
}
