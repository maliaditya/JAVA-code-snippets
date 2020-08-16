class VowelConsonant{
	public static void main(String[] args) {
		
		char Alp = 'C';

		String sVar;

		if( Alp == 'a' || Alp == 'e' || Alp == 'i' || Alp == 'o' || Alp == 'u' || Alp == 'A' || Alp == 'E' || Alp == 'I'|| Alp == 'O'|| Alp == 'U'){
			sVar = "Vowel";
		}
		else{
			sVar = "Consonant";
		}

		switch(sVar){

			case "Vowel":
				System.out.println("Character is a Vowel");
				break;

			case "Consonant":
				System.out.println("Character is a Consonant");
				break;
		}

	}
}