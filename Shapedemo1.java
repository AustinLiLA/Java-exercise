abstract class Shape{
	
	String shapeName;
	String shapeColour;
	double x; 
    double y;  
    public abstract void getArea();
	public abstract void getCenterPoint(); 


//constructor 
public Shape(String shapeName, String shapeColour, double x, double y){
	
	    this.shapeName = shapeName;
		this.shapeColour = shapeColour;
		this.x = x;
		this.y = y;
}

/* Setter method 

public void setShape(string shapeName,string shapeColour,double x,double y){

	this.shapeName = shapeName;
	this.shapeColour = shapeColour;
	this.x = x;
	this.y = y;
}

*/

// getter method 

public String getShapedetails(){
	
	return "Name" + this.shapeName+ ", " +"Colour " + this.shapeColour + "x " + this.x + "y " + this.y;
}

}
class Rectangle extends Shape{ 
   
        double height;
		double width; 
		boolean square;
        
				

     public Rectangle (String shapeName, String shapeColour, double x, double y, double height, double width, boolean square){
		  
		 super(shapeName, shapeColour, x, y);
		 this.height = height;
		 this.width = width;
		 this.square = square;
		
		 
	 }
	 
	 public void isSquare(){
		 
		 if (this.square == true){ 
		    
			System.out.println("the height and the width are the same value ");
		 }
	     else{ 
			 System.out.println("the height and the width are not the same value ");
		 }
	 }
        
        public void getArea(){
           
		
         System.out.println(height * width); 
		 
		}
		 
        public void getCenterPoint(){
		
		System.out.println ("Creating a center Point"); 
}

public String toString(){ 
     return "ShapeName " + shapeName + "," + "ShapeColour " + shapeColour;
}	


}

class Shapedemo1{ 

  public static void main(String [] args){ 

      Rectangle r1 = new Rectangle("rectangle", "green", 30.20, 20.20,10.2, 5.2, false);
	  Rectangle r2 = new Rectangle("square", "blue", 18, 18,6, 6, true); 
	  
  System.out.println(r1.toString());
  
 
  }
  
  
  
  
 }
 
