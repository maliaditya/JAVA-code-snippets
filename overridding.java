class university{

	university(){

		System.out.println("In constructor university");

	}

	void exam(){

		System.out.println("Main exam");
	}
}

class college extends university{
	college(){

		System.out.println("in constructor college");
	}

	void exam(){

		System.out.println("Faltu exam");
	}
}

class demo{
	public static void main(String[] args) {
		university obj1 = new university();
		college obj2 = new college();
		obj1.exam();
		obj2.exam();

		university p = new college();
		p.exam();

	}
}