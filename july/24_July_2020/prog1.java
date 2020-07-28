class EvenOdd{

    int evenOdd(int a){

        if(a%2 == 0 )
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        return 0;

    }

    public static void main(String[] args) {
        
        EvenOdd find = new EvenOdd();
        find.evenOdd(10);


    }
}