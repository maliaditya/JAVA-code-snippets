class IfElseDemo{


    public static void main(String[] args) {
        
        int x=30,y=20;
        if (++x == y++){
                System.out.println("x is smaller");
                System.out.println("In if");
                System.out.println(x);
                System.out.println(y);
        } else {
                System.out.println("In else");
                System.out.println(x);
                System.out.println(y);

        }
        System.out.println("out of if else");
    }
}