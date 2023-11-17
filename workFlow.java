
package org.openjfx;


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

	private ArrayList<Integer> reviewStack;
	private ArrayList<Integer> approveStack;

	
	
	/*
	 * Constructor initializes class variables
	 */

	workFlow() {

		 
		 this.reviewStack = new ArrayList<Integer>();
		 this.approveStack = new ArrayList<Integer>();
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
	
	

	public ArrayList<Integer> getReviewStack(){

		return this.reviewStack;
	}
	
	

	public void setReviewStack(ArrayList<Integer> reviewStack) {
		this.reviewStack = reviewStack;
	}
	
	

	public ArrayList<Integer> getApproveStack(){

		return this.approveStack;
	}
	
	

	public void setApproveStack(ArrayList<Integer> approveStack) {

		this.approveStack = approveStack;
	}
	
	/**
	 * Method takes in the applicant’s alien number and adds their form to the workflow process
	 * called by dataEntry when a form is made
	 * @param alienNumber
	 * @param x specifies which queue to add to
	 */

	public void addToWF(int formNumber, String step) {
		if(step == "Reviewer") {
			
			reviewStack.add(formNumber);
		} 
    else if (step == "Approval") {
			approveStack.add(formNumber);
    }
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
	 * @param x specifies from which queue to get next item
	 */

	public int getNextItem(String step) {
		int depFormNumber = 0;
		
		if(step == "Reviewer") {
			if (!reviewStack.isEmpty()) {
				depFormNumber = reviewStack.get(0);
				reviewStack.remove(0);
			}
		} else if (step == "Approval") {
			if (!approveStack.isEmpty()) {
				depFormNumber = approveStack.get(0);
				approveStack.remove(0);
			}
		}
		

		return depFormNumber;

	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args){
		 
	}

	
}