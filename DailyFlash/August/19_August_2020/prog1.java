class GetCase{


    static void findCase(int ch){
        if(ch >=65 && ch <=90){
            System.out.printf("%c is in uppercase.",ch);
        }else{
            System.out.printf("%c is in lowercase.",ch);
        }
    }

    public static void main(String[] args) {
        
        char c = 'v';

        findCase(c);
    }
}