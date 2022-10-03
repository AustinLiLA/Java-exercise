class Book{

   private String bookName;
   private String bookAuthor;
   private int bookPrice;


  public Book(String bookName, String bookAuthor, int bookPrice){
	  
	  
	  this.bookName = bookName;
	  this.bookAuthor = bookAuthor;
	  this.bookPrice = bookPrice;
 }
  
  public String getBookName(){
	  
	  return this.bookName;
   }
  
  public String getBookAuthor(){
	  
	  return this.bookAuthor;
   }
  
  public int getBookPrice(){
	  
	  return this.bookPrice;

   }
 
}
 //public String getBookDetails(){
	    
		
		//return "Name " +this.bookName+", "+" Author "+this.bookAuthor+", "+" Price "+this.bookPrice;
	
	//}
class Exercises3{ 

   public static void main(String[] args){
	   
	   Book b1 = new Book("Harry Potter", "JK", 20);
	   Book b2 = new Book("The 4 hour workweek", "Tim", 30);
	   Book b3 = new Book("Fast and Furious", "Mike", 40);
   
   System.out.println(b1.getBookName());
   System.out.println(b1.getBookAuthor());
   System.out.println(b1.getBookPrice());
   
   	
	 //Book[] books = {b1,b2,b3};
	   
	   
	  //for(Book b : books){
	  
	  //System.out.println(b.getBookDetails());
   }
   
  }