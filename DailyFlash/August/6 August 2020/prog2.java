class SwitchDemo{

    public static void main(String[] args) {
        

        int year = 3,marks= 80,a=0;

        switch(year){

            case 1:
                    System.out.println("not eligible for scholarship");
                    break;
            case 2: 
                    System.out.println("not eligible for scholarship");
                    break;
            case 3: 
             
                    switch(marks){
                      
                        case 80 :
                        System.out.println("Eligible for Educational scholarship");
                        break;
                    }
                    break;
            default:
                    System.out.println("Choose correct year");

                    
                }
        }
    }
