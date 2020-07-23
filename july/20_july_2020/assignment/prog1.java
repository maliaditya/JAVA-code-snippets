class BitwiseDemo{

    public static void main(String[] args){
        // For int it works 
        int num1 = 10;
        int num2 = 20;

        int res = 0;

        res = num1 & num2;
        System.out.println(res);

        res = num1 | num2;
        System.out.println(res);

        res = num1 ^ num2;
        System.out.println(res);

        // : error: bad operand types for binary operator '^'
        // dosent woks on float
        // float num3 = 10.9f;
        // float num4 = 20.3f;


        // res = num3 & num4;
        // System.out.println(res);

        // res = num3 | num4;
        // System.out.println(res);

        // res = num3 ^ num4;
        // System.out.println(res);


        double num3 = 10.9;
        double num4 = 20.3;


        res = num3 & num4;
        System.out.println(res);

        res = num3 | num4;
        System.out.println(res);

        res = num3 ^ num4;
        System.out.println(res);





        
    }
}
