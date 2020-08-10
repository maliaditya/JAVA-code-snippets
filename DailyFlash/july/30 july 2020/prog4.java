import java.util.Scanner;

class Numbers{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose between O-9: ");

        int ch = scan.nextInt();
        scan.close();

        switch(ch){

                case 0: 
                    System.out.println("ZERO");
                    break;
                case 1: 
                    System.out.println("ONE");
                    break;

                case 2: 
                    System.out.println("TWO");
                    break;

                case 3: 
                    System.out.println("THREE");
                    break;

                case 4: 
                    System.out.println("FOUR");
                    break;

                case 5: 
                    System.out.println("Five");
                    break;

                case 6: 
                    System.out.println("SIX");
                    break;

                case 7: 
                    System.out.println("SEVEN");
                    break;

                case 8: 
                    System.out.println("EIGHT");
                    break;

                case 9: 
                    System.out.println("NINE");
                    break;

                default:
                    System.out.println("Choose between O-9");
                    break;

        }
    }
}