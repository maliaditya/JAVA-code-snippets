

class Arithmetic{

    int num1 = 20;
    int num2 = 30;
    int ans = 0;
    
    void add(){
    ans  =  num1 + num2;
    System.out.println("Addtion = " + ans);
    }

    void sub(){
    ans  =  num1 + num2;
    System.out.println("subtraction = " + ans);
    }

    void mul(){
    ans  =  num1 * num2;
    System.out.println("Multiplication = " + ans);
    }

    void div(){
    ans  =  num1 / num2;
    System.out.println("Division = " + ans);
    }
    void mod(){
    ans  =  num1 % num2;
    System.out.println("Modulas = " + ans);
    }
}

class Logical{

    int num1 = 10;
    int num2 = 20;
    boolean ans;

    void logicalAnd(){
    ans = num1 != num2 && num1 < num2;
    System.out.println("Logical And: " + ans);
    }
    void logicalOr(){
    ans = num1 < num2 || num1 > num2;
    System.out.println("Logical OR: " + ans);
    }


}

class Bitwise{

    int num1 = 20;
    int num2 = 30;
    int ans = 0;

    void bitwiseAnd(){
        ans = num1 & num2;
        System.out.println("Bitwise And:"+ans);
    }

    void bitwiseOr(){
        ans = num1 | num2;
        System.out.println("Bitwise OR:"+ans );
    }

    void bitwiseXOR(){
        ans = num1 ^ num2;
        System.out.println("Bitwise XOR:" + ans);
    }

    void leftShift(){

        ans = num1 << 4;
        System.out.println("Left shift of 10 by 4: " + ans);
    }

    void rightShift(){

        ans = num2 >> 3;
        System.out.println("Right shift of 20 by 3: " +ans);
    }

    void unsignedRshift(){

        ans = num2 >>> 4;
        System.out.println("Unsigned Right shift of 20 by 4: " +ans);
    }

}

class operators{
    public static void main(String[] args ){
    Arithmetic cal = new Arithmetic();
    cal.add();
    cal.sub();
    cal.mul();
    cal.div();
    cal.mod();

    Logical log = new Logical();
    log.logicalAnd();
    log.logicalOr();

    Bitwise obj = new Bitwise();
    obj.bitwiseAnd();
    obj.bitwiseOr();
    obj.bitwiseXOR();
    obj.leftShift();
    obj.rightShift();
    obj.unsignedRshift();

    }

}