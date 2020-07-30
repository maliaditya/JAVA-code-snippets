import java.util.Scanner;

class ProgLang{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the char from (J/P/G/C/R): ");
        char ch = scan.next().charAt(0);

        scan.close();
     
        switch(Character.toUpperCase(ch)){

            case 'P':
                    System.out.println("Python");
                    break;
            case 'J':
                    System.out.println("Java");
                    break;
            case 'C':
                    System.out.println("C");
                    break;
            case 'R':
                    System.out.println("Ruby");
                    break;
            case 'G':
                    System.out.println("Go");
                    break;
            default : 
                    System.out.println("Please select appropriate character");
                    break;
        }

    }
}