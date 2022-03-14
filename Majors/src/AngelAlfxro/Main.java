package AngelAlfxro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("-------------------------");

        // created a set of polymorphic objects to then put them in an array
        Major myMaj = new Major();
        Major cs = new CompSci();
        Major bio = new Biology();
        Major phd = new BioPhD();

        // created these two new objects to access methods which are specific to CompSci.java and bioPhd.java
        CompSci cs1 = new CompSci();
        BioPhD phd1 = new BioPhD();

        // Array to store polymorphic objects
        Major[] myMajors = {myMaj, cs, bio, phd};

        // For-Loop to iterate through Array holding polymorphic objects
        for (int i = 0; i < 4; i++) {

            // The if else statements - reason is because certain classes (index 1, and 3 of the array) which contain separate methods not found in the Super() class.
            if(i == 1){
                System.out.println();
                System.out.println(myMajors[i]); // Polymorphic object which overrides the toString(); method.
                cs.toughness(); // Polymorphic object that overrides toughness(); method.
                cs1.length();
                System.out.println();
                System.out.println("---------------------");

            } else if(i == 3){
                System.out.println();
                System.out.println(myMajors[i]);
                phd.toughness(); // Second Polymorphic object that overrides toughness(); method.
                phd1.length();
                System.out.println();
                System.out.println("-------------------------");
            } else {
                System.out.println(myMajors[i]);
                myMajors[i].toughness();
                System.out.println();
                System.out.println("--------------------------");
            }
        }
        System.out.println();

        // overrode the equals() method found in Major.java to check gpaRequirements between different classes
        if(myMaj.equals(cs.getGpaRequirement())){
            System.out.println("The GPA requirements between entering college and entering the school of Computer science match");
        } else {
            System.out.println("The GPA requirements between entering college and entering the school of Computer science do not match");
        }
    }
}