class Dog extends Animal{ 




public Dog(String name, int age){
	
	super(name,age);

}

@Override
public String sayHello(){
	
	return "Hello dog";

}

@Override
public String move(){
	
	return "dog step"; 
}
@Override
public String toString(){
 
  return "Dog name is " + super.name + ", " + " Age is " + super.age;

}

}