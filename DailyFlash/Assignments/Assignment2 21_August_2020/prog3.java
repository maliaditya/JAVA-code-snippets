import java.io.*;


class VowelOrConsonant{


    static void isVowelOrConsonant(char ch){
        if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                System.out.println(Character.toLowerCase(ch) + " is a Vowel.");
        }else{
            System.out.println(ch + " is a Consonant.");
        }
        
    }

    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("\nEnter the character: ");
        char ch = br.readLine().charAt(0);

        isVowelOrConsonant(Character.toUpperCase(ch));

        

    }
}
