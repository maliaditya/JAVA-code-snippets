class Ghar{
	
	int mazya_room_chi_light = 1;
	static int hall_chi_light = 1;
	
	void Aadis_room(){
	
		System.out.println("room light = " + mazya_room_chi_light);

		System.out.println("hall light = " + hall_chi_light);
			
	}
	void hall(){
	
		System.out.println("room light = " + mazya_room_chi_light);
			
		System.out.println("hall light = " + hall_chi_light);
			

	}
 	
	public static void main(String[] args){

	Ghar obj1 = new Ghar();
	obj1.Aadis_room();


	Ghar obj2 = new Ghar();
	obj2.hall_chi_light = 0;
	obj2.hall();
	
	}

}
