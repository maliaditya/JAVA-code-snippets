class Memory{

    public static void main(String[] args) {
        
        int time,month = 0;
        System.out.println("******Time & Memory*******");
        System.out.println();

        for(time=1;time<=120;time++)
        {

                if(time%30==0){
                 month++;
                 if(month%2 != 0)
                 System.out.println("Remembering Time: " + time + " Mins = " + month + " Months" );
                 else
                 if(time%60 == 0)
                    System.out.println("Remembering Time: " +  month/2 + " Hours = " + month + " Months" );
     
                
            } 
        }

    }
}