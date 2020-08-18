class Alphabet{

    static void alphabetOrNot(char ch){

        if( (ch >='A' || ch >= 'a') &&(ch <= 'Z' || ch <= 'z')){
            System.out.println(ch +" is an alphabet.");
        } else{
            System.out.println(ch +" is not an alphabet.");

        }
    }

    public static void main(String[] args) {
        
        char ch = 'v';
        alphabetOrNot(ch);
    }
}