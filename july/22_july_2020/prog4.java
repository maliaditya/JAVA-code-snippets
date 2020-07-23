class Human{

    public static void main(String[] args) {
        Human lion = null;  //reference of Human
        Human tiger = null;
        Human puma = null;
        Human monkey = new Human(); //object created of Human
        
        // assigning boolean value got using instance of operator
        boolean isLionHuman = lion instanceof Human;//false
        System.out.println("Are Lion and Human of same species --> " + isLionHuman);
        
        // assigning boolean value got using instance of operator
        boolean isTigerHuman = tiger instanceof Human;//false
        System.out.println("Are Tiger and Human of same species --> " + isTigerHuman);
        
        // assigning boolean value got using instance of operator
        boolean isPumaHuman = puma instanceof Human; //false
        System.out.println("Are Puma and Human of same species --> " + isPumaHuman);
        
	
	        // assigning boolean value got using instance of operator 
        boolean isMonkeyHuman = monkey instanceof Human; //true
        System.out.println("Are Monkey and Human of same species --> " + isMonkeyHuman);
        

    }

}
