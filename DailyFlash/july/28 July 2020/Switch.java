class Switch {
    
    public static void main(String[] args) {
      

          int var = 11;
          System.out.println("before Switch");
          
          switch(var){
              
            case 1 : 
                        System.out.println("one");
                        break;
            case 2 : 
                        System.out.println("Two");
                        break;
            case 3 : 
                        System.out.println("Three");
                        break;
            case 4 : 
                        System.out.println("Four");
                        break;             
            case 5 : 
                        System.out.println("five");
                        break;
            case 6 : 
                        System.out.println("Six");
                        break;
            case 7 : 
                        System.out.println("Seven");
                        break;
            case 8 : 
                        System.out.println("Eight");
                        break;
            case 9 : 
                        System.out.println("nine");
                        break;
            case 10 : 
                        System.out.println("Ten");
                        break;
            default : 
                        System.out.println("In default statement");
                        break;
          }
          System.out.println("After Switch");
    }

}