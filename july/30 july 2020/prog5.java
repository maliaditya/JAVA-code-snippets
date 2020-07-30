import java.util.Scanner;

class Greater{


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int ch = scan.nextInt();
        scan.close();

        if(ch==0)
            System.out.println("Number is Equal to zero");
        else if (ch < 0)
            System.out.println("Number is Less than zero");
        else 
             System.out.println("Number is Greater than zero");


    }
}