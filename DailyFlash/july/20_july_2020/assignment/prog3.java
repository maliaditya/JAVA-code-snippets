class Demo{

    public static void main(String[] args){
        
        int num1 =10;
        int num2 = 5;
        int res = 0;
        res = (num1++ | num2)&((++num2)^num1);
        System.out.println(res);

    }
}