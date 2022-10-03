class Exercises{

public static void main(String[]args){
 
	String name = "Austin" ;
	Byte age = 20;    
	{System.out.println("My name is "+ name +" and age is "+ age );
	 System.out.println("his name is Tom ");
   } 
    Byte m = 1;
	Float x = 0.5f;
	Byte c = 15;
    System.out.println(" The result is " + (m * x + c ));
	
	Boolean isRaining = false;
	Boolean happy = false;
    if (isRaining == true & happy == true){
		System.out.println("It is raining and we are happy");
	}
	else if (isRaining == true & happy != true) {
	System.out.println("It is raining and we are not happy");
	}
	else if (isRaining != true & happy == true) {
		System.out.println("It is not raining and we are happy");
	}
    else if (isRaining != true & happy != true) {
	 System.out.println("It is not raining and we are not happy");
 }
}
}
    
    