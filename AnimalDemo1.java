import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
abstract class Animal <T extends Comparable>{
    
	String name;
	int age;
    public abstract String sayHello();
    public abstract String move(); 
    
  public static int compare(Cat c1, Cat c2){
	
	return c1.age.compareTo(c2.age);
}

//Constructor 
public Animal(String name, int age){

  this.name = name; 

  this.age = age; 

}   

//Setter 

public void setAnimalname(int age){
	
   this.age = age;

	
}

public void setAnimalname(String name){
	
   this.name = name;
	
}


//getter 

public String getAnimaldetails(String name, int age){
	
	return "Animal name is " + this.name + "," + "age is " + this.age;
	
	
	
}

//toString method 
public String toString(){
	
	return "Animal name is " + this.name + "," + "age is " + this.age;
	
 } 

}

class AnimalDemo1{
	public static void main(String[] args){
	

	Cat c1 = new Cat("Mike", 2);
	Cat c2 = new Cat ("Ab", 1);
    Dog d1 = new Dog("Ak", 3);
	Dog d2 = new Dog ("Mj", 4);
    Rabbit r1 = new Rabbit("Tina", 5);
	
	
	ArrayList<Animal>animals = new ArrayList<Animal>();
	
	ArrayList<Cat>cats = new ArrayList<Cat>();
	ArrayList<Dog>dogs = new ArrayList<Dog>();
	ArrayList<Rabbit>rabbits = new ArrayList<Rabbit>();
	
	cats.add(c1);
	cats.add(c2);
	dogs.add(d1);
	dogs.add(d2);
	rabbits.add(r1);
	System.out.println(cats);
	System.out.println(dogs);
	System.out.println(rabbits);
	
	/*HashMap<String, Cat>cats = new HashMap<>();
	HashMap<String, Dog>dogs = new HashMap<>();
	HashMap<String, Rabbit>rabbits = new HashMap<>();
	cats.put("Mike", c1);
	cats.put("Ab", c2);
	dogs.put("Ak", d1);
	dogs.put("MJ", d2);
	rabbits.put("Tina",r1);*/
	/*
	HashMap<Cat, String>cats = new HashMap<>();
	HashMap<Dog, String>dogs = new HashMap<>();
	HashMap<Rabbit, String>rabbits = new HashMap<>();
	
	cats.put(c1, "cat 1");
	cats.put(c2, "cat 2");
	dogs.put(d1, "dog 1");
	dogs.put(d2, "dog 2");
	rabbits.put(r1,"rabbit 1");
	
	HashSet<String> name = new HashSet<>();
	name.add("Mike");
	name.add("Ab");
	name.add("Ak");
	name.add("Mj");
	name.add("Tina");
	System.out.println(name);
	HashSet<Integer> age = new HashSet<>();
	age.add(2);
	age.add(1);
	age.add(3);
	age.add(4);
	age.add(5);
	System.out.println(age);
	System.out.println("Mike".hashCode()); */
	
	 //Enhanced for loop
	for(Cat c: cats){

	  System.out.println(c);
  }
  
  for(Dog d: dogs){

	  System.out.println(d);
  }
  
 for(Rabbit r: rabbits){

	  System.out.println(r);
  } 
 //Iterator
 Iterator<Cat> it = cats.iterator();
 Iterator<Dog> it1 = dogs.iterator();
 Iterator<Rabbit> it2 = rabbits.iterator();
   while (it.hasNext()){
 System.out.println(it.next());
 }
 while (it1.hasNext()){
 System.out.println(it1.next());
 }
 while (it2.hasNext()){
 System.out.println(it2.next());
 }
 //for loop 
 
  for (int i=0; i< cats.size(); i++){
	  
	  System.out.println(cats.get(i));
  }
 
 for (int i=0; i< dogs.size(); i++){
	  
	  System.out.println(dogs.get(i));
  }
  for (int i=0; i< rabbits.size(); i++){
	  
	  System.out.println(rabbits.get(i));
  }
  

  Collections.sort(cats);
  System.out.println(cats); 

}
	
	






}