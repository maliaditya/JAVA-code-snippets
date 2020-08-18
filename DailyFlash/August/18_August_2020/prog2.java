class VowelOrConsonant{

    static void vowelOrConsonats(char chr){
        char ch = Character.toUpperCase(chr);
        if(ch == 'A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' ){
            System.out.println(ch + " is a Vowel");
        }else if( (ch >='A' || ch >= 'a') &&(ch <= 'Z' || ch <= 'z')){
            System.out.println(ch +" is a Consonant.");
        }
    }
    public static void main(String[] args) {
        char ch = 'e';
        vowelOrConsonats(ch);
        
    }
}