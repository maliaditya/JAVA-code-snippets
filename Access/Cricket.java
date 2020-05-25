

class Cricket{

	static String capt = "Virat Kohli";
	int toss = 0;


	static void list(){
	
		System.out.println("Players");
		System.out.println(capt);
	
	}

	void toss(){
	
		System.out.println(toss);

	}


	public static void main(String[] args){
	
		list();
		Cricket obj = new Cricket();
		obj.toss();
	
	}




}
