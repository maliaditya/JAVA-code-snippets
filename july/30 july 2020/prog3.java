import java.util.Scanner;
class RTO{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****RTO State code to corresponding state****");

        System.out.print("Enter the RTO code from (MH,AP,GJ,AR,RJ): ");
        String ch = scan.next();
        scan.close();

        switch(ch){

            case "MH":
                        System.out.println("Maharashtra");
                        break;
            case "GJ":
                        System.out.println("Gujrat");
                        break;
            case "AP":
                        System.out.println("Andra-Pradesh");
                        break;
            case "RJ":
                        System.out.println("Rajasthan");
                        break;
            case "AR":
                        System.out.println("Arunachal-Pradesh");
                        break;
            default:
                        System.out.println("Please choose from given list");

        }
    }
}