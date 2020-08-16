class ReveseInteger{

    int reversedInt(int num){
        int reversedInteger =0;
        while(num>0){

            int remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        return reversedInteger;
    }

    public static void main(String[] args) {
        int n =420;
        ReveseInteger obj =new ReveseInteger();

        if (n%100 ==0){
        System.out.println("00" + obj.reversedInt(n));
        }else if(n%10 ==0)
        System.out.println("0"+obj.reversedInt(n));
        else
        System.out.println(obj.reversedInt(n));

    }


        
        
    
}