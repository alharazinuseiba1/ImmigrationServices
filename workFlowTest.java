import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class workFlowTest {
	

	/**
	 * tests if the obj can be created and is null or not
	 */
	@Test
	public void CreateWFObjTest1() {
        workFlow testobj = new workFlow("", null, null);
        assertNotNull(testobj);
    }
	
	/*
	 * tests if the obj is created from the workFlow class
	 */
	@Test
	public void CreateWFObjTest2() {
        workFlow testobj = new workFlow("", null, null);
        assertTrue(testobj instanceof workFlow);
    }
	
	/*
	 * tests if the dependentaddition form is added to the workflow by testing if the current status of the obj is "Data Entry"
	 */
	@Test
	public void addToWFTest1() {
		
        workFlow testobj = new workFlow("", null, null);
		testobj.addToWF(123456789);
		
		assertEquals("Data Entry", testobj.getCurrentStatus());
	}
	
	/*
	 *  tests if the dependentaddition form is added to the workflow by testing if the reviewStack and approveStack is null or not
	 */
	@Test
	public void addToWFTest2() {
		
        workFlow testobj = new workFlow("", null, null);
		testobj.addToWF(123456789);
	
		assertNotNull(testobj.getReviewStack());
		assertNotNull(testobj.getApproveStack());
	}
	
	/*
	 * tests if the dependentaddition form is added to the workflow by testing if the reviewStack and approveStack has an element or not when calling addToWF()
	 */
	public void addToWFTest3() {
		
        workFlow testobj = new workFlow("", null, null);
		testobj.addToWF(123456789);
	
		assertEquals(1, testobj.getReviewStack().size());
		assertEquals(1, testobj.getApproveStack().size());

	}
	
	/*
	 * tests if the current status of the workflow is updated when a workflow step is completed and updateWf() is called 
	 */
	@Test
	public void updateWFTest1() {
		
		workFlow testobj = new workFlow("", null, null);
		testobj.addToWF(123456789);
		testobj.updateWF(123456789, "Data Entry", "complete");
		
		assertEquals("Review", testobj.getCurrentStatus());
	}
	
	/*
	 * tests if the current status of the workflow is updated when workflow step is not finished and updateWf() is called 
	 */
	@Test
	public void updateWFTest2() {
		
		workFlow testobj = new workFlow("", null, null);
		testobj.addToWF(123456789);
		testobj.updateWF(123456789, "Data Entry", "complete");
		testobj.updateWF(123456789, "Review", "not complete");

		assertEquals("Review", testobj.getCurrentStatus());
	}
	
	/*
	 * tests if getNextItem() returns the next dependentaddtion obj's id in the review or approve stack
	 */
	@Test
	public void getNextItemTest1() {
		
        workFlow testobj = new workFlow("", null, null);
		testobj.addToWF(123456789);
		testobj.addToWF(486502193);
		assertEquals(123, testobj.getNextItem());
		
	}
	
	/*
	 * tests if getNextItem() returns no id since there is nothing in the review and approve stack
	 */
	@Test
	public void getNextItemTest2() {
		
        workFlow testobj = new workFlow("", null, null);
        
		assertTrue(testobj.getNextItem()== 0);
		
	}

}
