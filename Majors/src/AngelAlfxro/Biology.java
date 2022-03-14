package AngelAlfxro;

public class Biology extends Major {
    private int numChemClassesRequired;



    // constructor
    public Biology(){
        this.numChemClassesRequired = 2;
        setMajorName("Biology Major");
        setPreReqs("Organic-Chem");
        setGpaRequirement(3.5);
        setStatement("You are a " + this.getMajorName() + " which means you successfully achieved a minimum GPA of: "
                + this.getGpaRequirement() + " and you sucessfully finished your " + this.getPreReqs() + " so congrats!" +
                " additionally you have fulfilled the minimum amount of classes in the chemistry department which is: " + this.numChemClassesRequired +
                "by the way " + super.getDinnerHall());
    }





    // toughness method
    public void toughness(){
        System.out.println("Biology is very tough");
    }




    // getters

    public int getNumChemClassesRequired(){
        return numChemClassesRequired;
    }

    // setters

    public void setNumChemClassesRequired(int newNumChemClasses){
        this.numChemClassesRequired = newNumChemClasses;
    }
}

