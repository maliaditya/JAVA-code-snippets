


class Animal{

	static void wildAnimals(){
		
		System.out.println("Tiger");
	
	}
	void domesticAnimals(){
		
		System.out.println("Dog");
	
	} 

	public static void main(String[] args){
	
		Animal obj = new Animal();
		obj.domesticAnimals();

		wildAnimals();
		Animal.wildAnimals();
	

	}



}
