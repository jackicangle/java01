package schoolwork;

/**
 * ��̬(polymorphic)/this
 * @author 86131
 * 2020/3/24
 */

class Cat{
	private String eat,work;
	public Cat(String work,String eat){
		this.work = work;
		this.eat = eat;
		System.out.println("Hello China!");
		System.out.println("*********************");
		System.out.println("è��");
	}
	public void Work(){
		System.out.println(this.work);
	}
	public void Eat(){
		System.out.println(this.eat);
	}
}

class Dog{
	private String feed,job;
	public Dog(String job,String feed){
		this.job = job;
		this.feed = feed;
		System.out.println("����");
	}
	public void Job(){
		System.out.println(this.job);
	}
	public void Feed(){
		System.out.println(this.feed);
	}
}

class Message{
	private String nationality,name;
	
	public Message(String nationality,String name){
		this.nationality = nationality;
		this.name = name;
		this.get();
	}

	public void get(){
		System.out.println("������"+this.name+"\n������"+this.nationality);
	}
}

public class C{
	
	public static void main (String[] args){
		Cat cat = new Cat("           ץ����","           ����");
		cat.Work();
		cat.Eat();
			System.out.println("------------- ");
		Dog dog = new Dog("           ����","            �Թ�ͷ");
		dog.Job();
		dog.Feed();
			System.out.println("-------------");
		Person cop = new police();
		Person d = new doctor();
		cop.name ="����:";
		cop.work();
		cop.eat();
			System.out.println("-------------");
		d.name = "ҽ��:";
		d.work();
		d.eat();
			System.out.println("******************");
		Message outputMessage= new Message("�й�","J-king");
		
	}
}


class Person{
	String name;
	public void work(){
		
	}
	public void eat(){
	
	}
}

class police extends Person{
	public void work(){
		System.out.println(name+"ץС͵");
	}
	public void eat(){
		System.out.println("           �Է�");
	}
}

class doctor extends Person{
	public void work(){
		System.out.println(name+"����");
	}
	public void eat(){
		System.out.println("           �Ժз�");
	}
}