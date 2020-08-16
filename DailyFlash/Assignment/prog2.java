/**
 * 
 Program 2: Write a code in Java, to find Greatest Common Divisor (GCD) of two given
numbers
 */

 

 class GDC{

    int findGDC(int num,int num2 ,int divisor){
      
            for(int i=2;i<100;){

                    if(num%i == 0 && num2%i==0){
                        num = num/i;
                        num2 = num2/i;
                        divisor = divisor * i;
                    } 
                    else {
               
                        i++;    
                    }
            }


    
    return divisor;
    }

    public static void main(String[] args) {
        
        int a = 98;
        int b = 56;
        int gdc =  1;
        

        GDC obj = new GDC();
        System.out.println( "GDC " + obj.findGDC(a,b, gdc));
   


        
        


    }
 }