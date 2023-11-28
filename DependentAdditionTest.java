package org.openjfx;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


import org.junit.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class DependentAdditionTest {

	/**
	 * Tests that a dependent object is created
	 */
    @Test
    public void dependentCreationTest1(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        assertNotNull(dependent);
    }

    /**
     * Tests that the dependents information has been set correctly
     */
    @Test
    public void dependentCreationTest2(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        
        
        assertEquals(dependent.getName(),"Tom");
        assertEquals(dependent.getDateOfBirth(),"09/03/2002");
        assertEquals(dependent.getAddress(),"1234 Road" );
        assertEquals(dependent.getAlienNum(), "1234");
        assertEquals(dependent.getApplicantName(),"Mary");
        assertEquals(dependent.getApplicantAlienNum(),"5678");
        assertEquals(dependent.getApplicantEmail(), "mary@gmail.com");
    }

    /**
     * Tests creating an empty dependent object and sets the values
     */
    @Test
    public void dependentCreationTest3(){

        DependentAddition dependent = DependentAddition.dependentCreation();

        dependent.setName("Tom");
        dependent.setDateOfBirth("09/03/2002");
        dependent.setAddress("1234 Road");
        dependent.setAlienNum("1234");
        dependent.setApplicantName("Mary");
        dependent.setApplicantAlienNum("5678");
        dependent.setApplicantEmail("mary@gmail.com");
        
        assertEquals(dependent.getName(),"Tom");
        assertEquals(dependent.getDateOfBirth(),"09/03/2002");
        assertEquals(dependent.getAddress(),"1234 Road" );
        assertEquals(dependent.getAlienNum(), "1234");
        assertEquals(dependent.getApplicantName(),"Mary");
        assertEquals(dependent.getApplicantAlienNum(),"5678");
        assertEquals(dependent.getApplicantEmail(), "mary@gmail.com");

    }
    
    /**
     * Test for a valid dependent
     */
    @Test
    public void validateDependentTest1(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        assertTrue(dependent.validateDependent(dependent));
    }
    
    /**
     * Test for an invalid dependent due to improper format of birthday
     */
    @Test
    public void validateDependentTest2(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","0/0/0","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        assertFalse(dependent.validateDependent(dependent));
    }
    
    /**
     * Test for an invalid dependent due to improper format of email
     */
    @Test
    public void validateDependentTest3(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","marygmail.com");
        assertFalse(dependent.validateDependent(dependent));
    }
    
    /**
     * Test for an invalid dependent due to improper format of alienNumber
     */
    @Test
    public void validateDependentTest4(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "skdjfh", "Mary","5678","marygmail.com");
        assertFalse(dependent.validateDependent(dependent));
    }
    
    @Test
    public void saveToDBTest(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                "1234", "Mary","5678","mary@gmail.com");
        int database_size = DependentAddition.database.size();
        DependentAddition.saveToDB(dependent);
        // assert that the previous size + 1 is equal to the new size since we added an object
        assertEquals(database_size + 1, DependentAddition.database.size());
    }
    

}
