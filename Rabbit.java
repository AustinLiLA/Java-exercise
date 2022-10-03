class Rabbit extends Animal{ 




public Rabbit(String name, int age){
	
	super(name,age);

}

@Override
public String sayHello(){
	
	return "Hello rabbit";

}

@Override
public String move(){
	
	return "rabbit step"; 
}
@Override
public String toString(){
 
 return "Rabbit name is " + super.name + ", " + " Age is " + super.age;

}

}