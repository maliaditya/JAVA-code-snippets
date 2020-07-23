import outside.OutsideClass;

class InstanceStatic{

    InstanceStatic(){

        System.out.print("This is my constructor, &");
        System.out.println(" this will run on object creation");
    }


    void myInstanceMethod(){

        System.out.println("This is my instance method");
    
    }

    static void myStaticmethod(){

        System.out.println("This is my static method");
    }


    public static void main(String[] args){

        InstanceStatic myObj = new InstanceStatic();
        System.out.println("");

        InstanceStatic.myStaticmethod();
        System.out.println("");
        
        MyNewClass.myNewStaticMethod();
        System.out.println("");
        
        MyNewClass myObj1 = new MyNewClass();
        System.out.println("");
        
        myObj1.myNewInstanceMethod();
        System.out.println("");

        OutsideClass.outSideMethod();


 
    }

}