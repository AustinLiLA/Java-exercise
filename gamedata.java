class Game{

     int gameId;
	 String gameName;
} 
class Gamedata{

 public static void main(String [] args){
 
     Game g1 = new Game();
	  
	 Game g2 = new Game();
	 
	 Game g3 = new Game();
 
    g1.gameId = 1;
    g1.gameName = "god of war";

	g2.gameId = 2;
    g2.gameName = "Fortnite";
	
	g3.gameId = 3;
	g3.gameName = "Call of Duty"; 
	
	Game [] games = {g1,g2,g3};
	
	for(Game g: games){
		System.out.println(g.gameId);
		System.out.println(g.gameName);
 
	}
 
 
  }
 
 }