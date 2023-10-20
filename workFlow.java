import java.util.ArrayList;

public class workFlow {

	
	/**
	 * class variables
	 * currentStatus represents what step the specific dependentaddition's form is in the workflow 
	 * check represents whether the workflow step is completed or not, so "complete" or "not complete"
	 * reviewStack represents a list that contains the stack of dependentaddition forms to be reviewed
	 * approveStack represents a list that contains the stack of dependentaddition forms to be reviewed
	 */
	private String currentStatus;
	private String check;
	private ArrayList<String> reviewStack;
	private ArrayList<String> approveStack;
	
	
	/*
	 * Constructor initializes class variables
	 */
	workFlow(String status, ArrayList<String> reviewStack, ArrayList<String> approveStack) {
		 
		 this.currentStatus = status;
		 this.reviewStack = reviewStack;
		 this.approveStack = approveStack;
	 }
	 
	/*
	 * setters and getters
	 */
	public String getCurrentStatus() {
		return this.currentStatus;
	}
	
	
	public void setCurrentStatus(String status) {
		this.currentStatus = status;
	}
	
	
	public String getCheck() {
		return this.check;
	}
	
	
	public void setCheck(String check) {
		this.check = check;
	}
	
	
	public ArrayList<String> getReviewStack(){
		return this.reviewStack;
	}
	
	
	public void setReviewStack(ArrayList<String> reviewStack) {
		this.reviewStack = reviewStack;
	}
	
	
	public ArrayList<String> getApproveStack(){
		return this.approveStack;
	}
	
	
	public void setApproveStack(ArrayList<String> approveStack) {
		this.approveStack = approveStack;
	}
	
	/**
	 * Method takes in the applicant’s alien number and adds their form to the workflow process
	 * called by dataEntry when a form is made
	 * @param alienNumber
	 */
	public void addToWF(int alienNumber) {
		
		return;
	}
	
	/**
	 * Method changes the status of the workflow and is performed when a workflow step is done
	 * @param alienNumber
	 * @param status
	 * @param check
	 */
	public void updateWF(int alienNumber, String status, String check) {
			
		return;
	}
	
	/**
	 * returns an id of the specific dependentaddition form that the next workflow step needs in order to find it from the database and work on it
	 * @return id
	 */
	public int getNextItem() {
		
		
		return 1;
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args){
		 
	}

	
}
