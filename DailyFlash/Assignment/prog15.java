class CountSteps{

    static  int numberOfSteps (int num) {
        int val=0;
        while(num>0){
            if((num%2)==0){
                num = num/2;
            }else{
               num = num-1;
            }
    
        System.out.print( " " + num);
        val++;
        }
        return val;
        }



    public static void main(String[] args) {
        
        int num =123;

        System.out.println(122&1);

        System.out.println(" Steps required : "+ numberOfSteps(num));
       
    }
}