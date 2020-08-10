//using name conventions in java while writing java program
//knowing Diffrence Between identifiers and Keyword

//import java.lang.*;
class MachineLearning{  //extends object
    
    //constructor 
        //invoke special

    
    static void learnPython(){

        System.out.println("1)Python:            Learning Python by Mark Lutz");
    }

    static void dataScience(){

        System.out.println("2)Data Science:      Python-for-Data-Analysis-2nd-Edition");
    }

    static void machineLearning(){

        System.out.println("3)Machine Learning:  Hands-On-Machine-Learning-with-Scikit-Learn-Keras-and-Tensorflow_");
    }

    static void deepLearning(){

        System.out.println("4)Deep Learning:     DeepLearningPractitionersApproach");
    }

    void followSteps(){
            System.out.println("    Steps                  Refrence books:");
            learnPython();
            System.out.println("");
            dataScience();
            System.out.println("");
            machineLearning();
            System.out.println("");
            deepLearning();

    }


    public static void main(String[] args){

        MachineLearning path = new MachineLearning();
        path.followSteps();
    }
}