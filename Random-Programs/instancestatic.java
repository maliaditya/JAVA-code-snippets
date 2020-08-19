


class Hostel{

	int R_no = 506;
	int floor = 3;
	static String Rector = "Chaudhari";

	void Kand(){
	
		System.out.println("amhi mula kay kand kartoy "+ R_no + " madhe te chaudhari la nahi kalnar ye karan amhi instance ahot");
	}

	static void rector(){
	
		System.out.println(Rector + " sobat kai kand zala tar saglyana kalnar ahe karan to Hostel sati static ahe");
		Hostel boys = new Hostel();
		System.out.println(boys.floor + "rd floor wale M*d*rch*d ahet");
	}



	public static int main(String[] args){ 
	
	Hostel Boys = new Hostel();
	Boys.Kand();

	rector();

	return 0;
	
	}

}
