package AngelAlfxro;

public class Major {

    private double gpaRequirement;
    private String majorName;
    private String preReqs;
    private String statement;
    private String dinnerHall;

    // constructor
    public Major() {
        this.gpaRequirement = 2.0;
        this.majorName = "College Student";
        this.preReqs = "SATs";
        this.dinnerHall = "We have complimentary dinner in the dinner hall";
        this.statement = "You are a " + this.majorName + " which means you successfully achieved a minimum GPA of: "
                + this.gpaRequirement + " and you sucessfully finished your " + this.preReqs + " so congrats! By the way  " + this.dinnerHall;

    }

    // overrides toString
    public String toString() {
        return statement;
    }

    // equals gpa
    public boolean equals(double newGpaRequirement) {
        if (this.gpaRequirement == newGpaRequirement) {
            return true;
        } else {
            return false;
        }
    }

    // toughness method which is found in every subclass
    public void toughness() {
        System.out.println("College is very tough");
    }


    // getters

    public double getGpaRequirement() {
        return gpaRequirement;
    }

    public String getMajorName() {

        return majorName;
    }

    public String getPreReqs() {
        return preReqs;
    }


    public String getStatement() {
        return statement;
    }


    public String getDinnerHall() {
        return dinnerHall;
    }

    // setters

    public void setGpaRequirement(double gpa) {

        this.gpaRequirement = gpa;
    }

    public void setMajorName(String newMajorName) {

        this.majorName = newMajorName;
    }

    public void setPreReqs(String newPreReqs) {
        this.preReqs = newPreReqs;
    }


    public void setStatement(String newStatement) {
        this.statement = newStatement;
    }

    public void setDinnerHall(String newDinnerHall) {
        this.dinnerHall = newDinnerHall;
    }

}
