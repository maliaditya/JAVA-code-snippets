class NestedSwitchDemo{

    public static void main(String[] args) {
        
        int floor = 1;
        switch(floor){
            case 1 :
                    {
                         char ch = 'S';
                         System.out.println("First Floor");

                         switch(ch){
                             case 'S':
                             case 's':
                                    System.out.println("shopping");
                                    break;
                            case 'F':
                            case 'f':
                                    System.out.println("Nusta Khaycha");
                                    break;
                            default :
                                System.out.println("Service not Available");
                                break;

                         }
                    }
                break;
            case 2 :

                    {
                        char ch = 'M';
                        System.out.println("shopping");
                        
                        switch(ch){
                            case 'M':
                            case 'm':
                                    System.out.println("Dil bechara Movie");
                                    break;
                            case 'P':
                            case 'p':
                                    System.out.println("Cricket");
                                    break;
                            default :
                                    System.out.println("Service not Available");
                                    break;

                        }
                    break;
                    }

            default : 
                System.out.println("Wrong Floor");
                break;
        
    }
}
}