class GDC{

   
    public static void main(String[] args) {
        
        int num1 = 25;
        int num2 = 15;
        
        for(int i=num1/2;i>0;i--){

            if (num1%i==0 && num2%i==0){
            System.out.printf("\n The Gdc of %d & %d is %d",num1,num2,i);
                break;
        }

        }

    }
}