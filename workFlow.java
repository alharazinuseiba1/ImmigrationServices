import java.util.ArrayList;

public class workFlow {

	
	
	public String status;
	private ArrayList<String> reviewStack;
	private ArrayList<String> approveStack;
	
	

	
	private workFlow(String status, ArrayList<String> reviewStack, ArrayList<String> approveStack) {
		 
		 this.status = status;
		 this.reviewStack = reviewStack;
		 this.approveStack = approveStack;
	 }
	 
	
	
	public void addToWF(int alienNumber) {
		
		return;
	}
	
	
	public int getNextItem(String status) {
		
		
		return 1;
	}
	
	public void updateWF(int alienNumber, String status) {
		
		
		return;
	}
	
	
	public static void main(String[] args){
		 
	}
	
	
	
	
}
