class Equals{

    public static void main(String[] args){

        int i = 65;
        char c = 'A';
        float f1 = 65.0f, f2 = 88.5f, f3 = 103.6f;
        double d1 = 65.0, d2 = 88.5, d3 = 103.6;
        

        float a = 88.5f;  
      
        System.out.println(a);

        Double v = 88.5;  
      
        System.out.println(v);

        if(a==v){
            System.out.println("same val");
        }
        else{
            System.out.println("diff val");
        }

        //i = c because the ascii value of A is 65 thus "A" = 65
        if(i == c){
            System.out.println("i is equal to c");
        }
        else{
            System.out.println("i is not equal to c");

        }

        //i = c because the ascii value of A is 65 thus "A" = 65
        
        if(f1 == c){
            System.out.println("f1 is equal to c");
        }
        else{
            System.out.println("f1 is not equal to c");

        }

        if(d1 == c){
            System.out.println("d1 is equal to c");
        }
        else{
            System.out.println("d1 is not equal to c");

        }

        if(f2 == d2){
            System.out.println("f2 is equal to d2");
        }
        else{
            System.out.println("f2 is not equal to d2");

        }

        if(f1 == d1){
            System.out.println("f1 is equal to d1");
        }
        else{
            System.out.println("f1 is not equal to d1");

        }
    }
}