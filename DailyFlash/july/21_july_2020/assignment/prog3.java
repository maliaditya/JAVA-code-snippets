class ShiftDemo{
    public static void main(String[] args){

        int num1 =188;
        int num2 =255;
        int num3 =-108;
        int num4 =-123;
        
        int res;

        res = num1 >>> 4;
        System.out.println(res);
        // the leftshift operator << works same as unsigned leftshift  <<< so java has only on << operator
        //res = nu>>m2 <<< 3;
        //System.out.println(res);

        res = num3 >>>23;
        System.out.println(res);

        //res = num4 <<<15;
        //System.out.println(res);
    }
}