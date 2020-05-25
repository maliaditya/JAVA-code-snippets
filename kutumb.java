class Kutumb{

	int Mob = 1;
	int Laptop = 1;
 static int TV = 1;

	void Aditya(){

		System.out.println("Mob = "+ Mob);
		System.out.println("Laptop = "+ Laptop);
		System.out.println("TV = "+ TV);	

	}

	static void Dii(){
	
	//		System.out.println("Mob = "+ Mob);
	//		System.out.println("Laptop = "+ Laptop);
			System.out.println("TV = "+ TV);
	
		}
}
class newclass{
	public static void main(String[] args){
	
		Kutumb adi = new Kutumb();
		adi.TV = 0;
		adi.Aditya();

    	//	Kutumb dii = new Kutumb();
	//	dii.Dii();

		Kutumb.Dii();
	}
	

}
