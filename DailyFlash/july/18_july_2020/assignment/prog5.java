/* Program 5: Write 2 classes as Pune, Mumbai. Add the following things:
class Pune :
static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown
noLockdown

class Mumbai :
static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown
noLockdown

Increment both the variables in non-static method. Call non-static methods twice,
display the output and observe the changes. Draw JVM architecture for the same. */

class Pune{

    static  int covidActiveCases = 40000;
    int totalCases = 100000;



    static void noCorona(){
        
        System.out.println("NO COVOD-19 NO LOCKDOWN ");

    }

    void lockdown(){
        System.out.println("LOCKDOWN ");

        System.out.println("Active Cases" + ++covidActiveCases);
        System.out.println("total cases" + ++totalCases);
    }

    void noLockdown(){
        System.out.println(" NO LOCKDOWN ");

        System.out.println("Active Cases" + ++covidActiveCases);
        System.out.println("total cases" + ++totalCases);
    }

}

class Mumbai{

    static  int covidActiveCases = 60000;
    int totalCases = 200000;


    static void noCorona(){
        
        System.out.println("NO COVOD-19 NO LOCKDOWN ");

    }

    void lockdown(){
        System.out.println("LOCKDOWN ");

        System.out.println("Active Cases" + ++covidActiveCases);
        System.out.println("total cases" + ++totalCases);
    }

    void noLockdown(){
        System.out.println(" NO LOCKDOWN ");

        System.out.println("Active Cases" + ++covidActiveCases);
        System.out.println("total cases" + ++totalCases);
    }


}

class Covid{

    public static void main(String[] args){
    
    
        System.out.println("PUNE");
        Pune obj1 = new Pune();
        obj1.lockdown();
        System.out.println();

        obj1.noLockdown();
        System.out.println();

        Pune.noCorona();


        System.out.println();

        System.out.println("Mumbai");
        Mumbai obj = new Mumbai();
        obj.lockdown();
        System.out.println();
        
        obj.noLockdown();
        System.out.println();

        Mumbai.noCorona();




    }
}