class Reverse{

    public static void main(String[] args) {
        int num;
        System.out.println("");

        System.out.print("Reversed Order: " );

        for(num=100 ; num>0;num--){
            System.out.print(num+ " ");

        }
        System.out.println("");
        System.out.println("");

        System.out.print("Divisible by 5 : ");
        for(num=100 ; num>0;num--){
            if( num%5 == 0)
                System.out.print(num + " ");
        }
    }
}