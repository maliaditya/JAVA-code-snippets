class Angle{

    void findAngle(int a){

        if(a<90)
            System.out.println("Acute Angle");
       else if(a == 90)
           System.out.println("Right Angle");
        else
           System.out.println("Obtuse Angle");


    }


    public static void main(String[] args) {
    
        Angle obj = new Angle();
        obj.findAngle(23);

    }
}