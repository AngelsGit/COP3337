package AngelAlfxro;

public class BioPhD extends Biology{
    private int researchHours;
    private int teachingHours;
    private String secondStatement;



    // constructor
    public BioPhD(){
        this.researchHours = 200;
        this.teachingHours = 200;
        this.secondStatement = "The bio phd program requires a lot";
        setMajorName("PhD candidate");
        setPreReqs("Bachelors in Biology ");
        setGpaRequirement(3.7);
        setNumChemClassesRequired(4);
        setStatement("You are a " + this.getMajorName() + " which means you successfully achieved a minimum GPA of: "
                + this.getGpaRequirement() + " and you sucessfully finished your " + this.getPreReqs() + " so congrats!" +
                " additionally you have fulfilled the minimum amount of classes in the chemistry department which is: " + this.getNumChemClassesRequired() +
                " as well as you have completed both your " + this.researchHours + " hours of research as well as your " + this.teachingHours + " hours of teaching. By the way " + super.getDinnerHall());

    }




    public void toughness(){
        System.out.println("The bio phd program is tough");
    }


    // Length method which is only for Compsci and Phd
    public void length(){
        System.out.println("A PhD in Biology is a 5 year program");
    }


    // getters
    public int getResearchHours(){
        return researchHours;
    }

    public int getTeachingHours() {
        return teachingHours;
    }



    // setters
    public void setResearchHours(int newResearchHours){
        this.researchHours = newResearchHours;
    }

    public void setTeachingHours(int newTeachingHours){
        this.teachingHours = newTeachingHours;
    }


}
