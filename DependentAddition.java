public class DependentAddition{

    private DependentAddition dependent;
    private String name;
    private String dateOfBirth;
    private String address;
    private int alienNum;
    private String applicantName; 
    private int applicantAlienNum;
    private String applicantEmail;

  

    private DependentAddition(String name, String dateOfBirth, String address, int alienNum, 
                                String applicantName, int applicantAlienNum, String applicantEmail)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.alienNum = alienNum;
        this.applicantName = applicantName;
        this.applicantAlienNum = applicantAlienNum;
        this.applicantEmail = applicantEmail;
    }

    private DependentAddition(){}

    public static DependentAddition dependentCreation(String name, String dateOfBirth, String address, int alienNum, 
                                    String applicantName, int applicantAlienNum, String applicantEmail)
    {
                return new DependentAddition(name, dateOfBirth, address, alienNum,applicantName,applicantAlienNum,applicantEmail);                                   
    }

    /*
     * Allows the values to be set later by using the setters
     */
    public static DependentAddition dependentCreation(){
        return new DependentAddition();
    }

    public boolean validateDependent(DependentAddition da){
        return false;
    }

    public Boolean saveToDB(DependentAddition dependent){
        return null;
    }

    public static DependentAddition getDependentFromDB(int alienNumber){
        return null;
    }

    /*
    * Should call validate dependent before updating
    */
    public Boolean updateDependent(DependentAddition dependent){
        return null;
    }

    // Setters

    public void setName(String name){}

    public void setDateOfBirth(String birthdate){}

    public void setAddress(String address){}

    public void setAlienNum(int alienNum){}

    public void setApplicantName(String applicantName){}

    public void setApplicantAlienNum(int applicantAlienNum){}

    public void setApplicantEmail(String applicantEmail){}

    // Getters

    public String getName(){
        return "";
    }

    public String getDateOfBirth(){
        return "";
    }

    public String getAddress(){
        return "";
    }

    public int getAlienNum(){
        return -1;
    }

    public String getApplicantName(){
        return "";
    }

    public int getApplicantAlienNum(){
        return -1;
    }

    public String getApplicantEmail(){
        return "";
    }

    public DependentAddition getDependent(){
        return null;
    }
}

