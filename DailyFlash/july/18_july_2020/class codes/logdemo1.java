class LogicalDemo1 {

    public static void main(String[] args){

        int x = 2;
        int y = 3;
        boolean ans;

        ans = (++x < y++) &&(x++ < ++y );  // false
        System.out.println("ans " + ans);
        System.out.println("x " + x);
        System.out.println("y " + y);

        ans = (++x <= y++) || (x++ < ++y ); //true
        System.out.println("ans " + ans);
        System.out.println("x " + x);
        System.out.println("y " + y);
    }
    
}