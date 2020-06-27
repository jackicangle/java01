package schoolwork;

/**
 * 多态(polymorphic)/this
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
		System.out.println("猫：");
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
		System.out.println("狗：");
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
		System.out.println("姓名："+this.name+"\n国籍："+this.nationality);
	}
}

public class C{
	
	public static void main (String[] args){
		Cat cat = new Cat("           抓老鼠","           吃鱼");
		cat.Work();
		cat.Eat();
			System.out.println("------------- ");
		Dog dog = new Dog("           看家","            吃骨头");
		dog.Job();
		dog.Feed();
			System.out.println("-------------");
		Person cop = new police();
		Person d = new doctor();
		cop.name ="警察:";
		cop.work();
		cop.eat();
			System.out.println("-------------");
		d.name = "医生:";
		d.work();
		d.eat();
			System.out.println("******************");
		Message outputMessage= new Message("中国","J-king");
		
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
		System.out.println(name+"抓小偷");
	}
	public void eat(){
		System.out.println("           吃饭");
	}
}

class doctor extends Person{
	public void work(){
		System.out.println(name+"看病");
	}
	public void eat(){
		System.out.println("           吃盒饭");
	}
}