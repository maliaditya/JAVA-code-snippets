import java.io.*;

class Factorial{


    static int factorialOfNum(int num){

        if(num == 1){
            return num;
        }
        return num * factorialOfNum(num-1);
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("\nEnter the min Range");
        int minRange = Integer.parseInt(br.readLine());

        System.out.printf("\nEnter the max Range");
        int maxRange = Integer.parseInt(br.readLine());


        for(int i=minRange;i<maxRange;i++){

            int fact = factorialOfNum(i);
            System.out.printf("\n factorial of %d is %d ",i,fact);
            

        }


        


    }
}