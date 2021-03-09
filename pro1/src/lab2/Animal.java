package lab2;


	public class Animal  // ICICBankApplication(Server)
	{
		public int energy;
		
		
        public int feedFood() {
			
			int temp=5;
			System.out.println("energy full");
			return temp;
		}
		public  int animalEnergy(int energy) {
			int temp=energy;
			if(temp==0) {
				System.out.println(" feed food");
				energy=feedFood();
				
					
				}
			else {
					temp--;
					energy=temp;
				}
			
			return energy;
			
			}
		public void doWalk()      // task1
		{
			
			System.out.println(" All animal walks");
		}
		public void doEat() {
			System.out.println(" All animals eat");
		}		
	}
	

	class Dog extends Animal // ICICIBankOnlineApplication
	{
		
		int energy=4;
		@Override
		public void doWalk() {
			// 1000 lines of code 
			energy=animalEnergy(energy);
			System.out.println(" Dog is walking");
			System.out.println(energy);	
		}

		public void playGame()   // task2
		{ 
			energy=animalEnergy(energy);
			System.out.println(" Dog plays Games");
			System.out.println(energy);
		}
		public void jump() {
			energy=animalEnergy(energy);
			System.out.println(" Jumping dog");
			System.out.println(energy);
			
		}
		
		public void sleep() {
			energy=animalEnergy(energy);
			System.out.println(" Dog is sleeping");
			System.out.println(energy);
		}
		public void catchball() {
			energy=animalEnergy(energy);
			System.out.println(" throw the ball for the dog to catch");
			System.out.println(energy);
		}
	}


	class Cat extends Animal
	{
		int energy=6;
		@Override
		public void doWalk()
		{
			// 1000 lines of code 
			energy=animalEnergy(energy);
			System.out.println(" Cat is walk");
			System.out.println(energy);	
		}
		
		public void doCatThings()
		{
			energy=animalEnergy(energy);
			System.out.println(" Cat things implementation ");
			System.out.println(energy);	
		}
		
		public void drinking() {
			energy=animalEnergy(energy);
			System.out.println(" cat is drinking milk");
			System.out.println(energy);	
			
		}
		public void playing() {
			energy=animalEnergy(energy);
			System.out.println("cat is playing with wool ");
			System.out.println(energy);	
		}
		public void sleeping() {
			energy=animalEnergy(energy);
			System.out.println(" cat is tierd and sleeping");
			System.out.println(energy);	
		}
		
	}
	class Bull extends Animal{
		int energy=5;
		public void doFieldWork() {
			energy=animalEnergy(energy);
			System.out.println(" Bull is working ");
			System.out.println(energy);	
		}
		
	}

