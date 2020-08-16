

class PowerOf2{

    void powerOf2(int num){
        
        int ans = num * num;
        System.out.println(num + " to the power of 2 is "+ ans);

    }
    public static void main(String[] args) {
        
        int num = 10;

        PowerOf2 obj = new PowerOf2();
        obj.powerOf2(num);
    }
}