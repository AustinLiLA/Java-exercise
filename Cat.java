class Cat extends Animal{ 




public Cat(String name, int age){
	
	super(name,age);

}

@Override
public String sayHello(){
	
	return "Hello cat";

}

@Override
public String move(){
	
	return "Cat step"; 
}

@Override
public String toString(){
 
  return "Cat name is " + super.name + ", " + " Age is " + super.age;

}

}
