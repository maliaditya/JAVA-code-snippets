class Attendance{

    boolean isEligible(int a){

        if (a < 75){
            System.out.println("Not eligible for exam");
            return (a < 75 );
        }
        else{
            System.out.println("Eligible for exam");
            return (a > 75 );
        }


    }
    public static void main(String[] args) {
        
        Attendance obj = new Attendance();
        obj.isEligible(57);
        System.out.println(System.out.toString());


    }
}