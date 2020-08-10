class IfElseDemo{


    public static void main(String[] args) {
        
        int x=30,y=20;
        if (++x == y++){
                System.out.println("In if");
                System.out.println("X = " + x);
                System.out.println("Y = " + y);
        } else {
                System.out.println("In else");
                System.out.println("X = " + x);
                System.out.println("Y = " + y);

        }
        System.out.println("out of if else");
    }
}