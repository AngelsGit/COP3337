package AngelAlfxro;

public class CompSci extends Major{

    private double foundationsExamGrade;
    private String programmingLanguage;
    private String secondStatement = "Compsci is very tough";



    // constructor
    public CompSci(){
        this.foundationsExamGrade = 70.0;
        this.programmingLanguage = "java";
        secondStatement = "Compsci is very tough";
        setMajorName("Computer Science major");
        setPreReqs("OOP");
        setGpaRequirement(3.0);
        setStatement("You are a " + this.getMajorName()+ " which means you successfully achieved a minimum GPA of: "
                + this.getGpaRequirement() + " and you sucessfully finished your " + this.getPreReqs() + " so congrats!" +
                "additionally you have also completed the foundations exam with a minimum score of " + this.foundationsExamGrade + " so be prepared for " +
                this.getPreReqs() + " concepts. By the way " + super.getDinnerHall()); // implimented the super. to call getDinnerHall statement. Did not need it but just wanted to show I know how to properly use it.

    }




    public void toughness(){
        System.out.println("Compsci is very tough");
    }

    // length method which is solely in the CompSci and PhD class
    public void length(){
        System.out.println("CompSci is a 5 year program");
    }

    // getters

    public double getFoundationsExamGrade(){
        return foundationsExamGrade;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }


    public String getSecondStatement(){
        return secondStatement;
    }
    // setters

    public void setFoundationsExamGrade(double newGrade){
        this.foundationsExamGrade = newGrade;
    }

    public void setProgrammingLanguage(String newLanguage){
        this.programmingLanguage = newLanguage;
    }

}
