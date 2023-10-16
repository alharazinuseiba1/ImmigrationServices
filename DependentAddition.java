public class DependentAddition{

    private DependentAddition dependent;
    private String name;
    private String dateOfBirth;
    private String address;
    private int alienNum;
    private String applicantName; 
    private int applicantAlienNum;
    private String applicantEmail;

    public static void main(String[] args){
    }

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

    public void dependentCreation(String name, String dateOfBirth, String address, int alienNum, 
                                    String applicantName, int applicantAlienNum, String applicantEmailString )
    {
                  this.dependent = new DependentAddition(name, dateOfBirth, address, alienNum, 
                                                        applicantName,applicantAlienNum,applicantEmail);                      
    }

    public DependentAddition getDependentAddition(){
        return this.dependent;
    }

    public String validateDependent(DependentAddition da){
        return "ok";
    }

    public Boolean saveToDB(DependentAddition dependent){
        return true;
    }

    public DependentAddition getDependentFromDB(int alienNumber){
        return null;
    }

    public Boolean updateDependent(DependentAddition dependent){
        return true;
    }
}