//Remember a class always extends object class automatically if it does not have any parent class
// -> jyacha koni nasto tyacha DEV asto java cha DEV == class Object{....
        //                                                            Object(){
        //                                                               return              
//                                                                       }     
//                                                                   } 


class Modi {

     //only declared here memory will be allocated in constructor when called on object creation
    String speech = "Mitro ....";                 

    Modi(){                                   
        
        System.out.println("In constructor");     // First printed 
    }

    public static void main(String[] args){

        System.out.println("In Main");
    }

    
}

class Lockdown extends Modi{
        //Lockdown(){super() ... }  Calls constructor of parent class Modi
 
    public static void main(String[] args){

        Lockdown obj = new Lockdown();    //Call to constructor of Lockdown
        System.out.println(obj.speech);   // speech inherited from Modi  2nd printed
 
        System.out.println("In Lockdown Main");// printed 3rd 
    }
}