
class Kutumb{

	int Mob = 1;
	int Laptop = 1;
	static int TV = 1;

	void display(){
		
		System.out.println("In display");
	
	}
	
	static void statedisplay(){
		
		System.out.println("StatDisplay");
	
	}

	public static void main(String[] args){
	
		Kutumb obj = new Kutumb();
	        obj.display();
		obj.statedisplay();

		Kutumb obj1  = new Kutumb();
		obj1.display();
		obj1.statedisplay();

	
	}

}
