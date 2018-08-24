package test;

public class Person {
	
	int health, age;
	String name;
	
	public Person(int health, String name, int age) {
		this.health = health;
		this.name = name;
		this.age = age;
	}
	
	public Person() {}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [health=" + health + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
