package lab2;

public class AnimalGame {

	public static void main(String[] args) {
		
		AnimalGame user = new AnimalGame();
		
		Dog dog = new Dog();
		user.userPlayAnimalGame(dog);
		
		System.out.println("\n\n ** Lets change to cat ** \n");
		
		
		  Cat cat = new Cat(); 
		  user.userPlayAnimalGame(cat);
		  
		  System.out.println("\n\n ** Lets change to bull ** \n");
		  
		  Bull bull=new Bull();
		  user.userPlayAnimalGame(bull);
		 
	}
	
	
	public void userPlayAnimalGame(Animal a)
	{
		a.doWalk();
		
		
		    if(a instanceof Dog)
		     {
				Dog d = (Dog)a;
				d.playGame();	
				d.jump();
				d.catchball();
				d.sleep();
				d.jump();
				
		     }
			else if(a instanceof Cat)
			{
				Cat cat = (Cat)a;
				cat.doCatThings();
				cat.drinking();
				cat.playing();
				cat.sleeping();
			}
			else if( a instanceof Bull) {
				Bull bull = (Bull)a;
				bull.doFieldWork();
			}
		
	}}
