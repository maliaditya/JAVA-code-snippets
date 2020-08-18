class AlphabetCharOrDig{

    static void alphabetOrNot(int ch){

        if((ch>=65 && ch <=90) || (ch>=97 && ch <=122)){
            System.out.println((char)(ch) +" is an alphabet.");
        } else if((ch>=48 && ch <=57)){
            System.out.println(ch +" is a digit.");

        }else{
            System.out.println((char)(ch) +" is a special character.");

        }
    }

    public static void main(String[] args) {
        
        char ch = '*';
        alphabetOrNot(ch);
    }
}