import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class DependentAdditionTest {

    @Test
    public void dependentCreationTest1(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");
        assertThat(dependent, instanceOf(DependentAddition.class));
    }

    @Test
    public void dependentCreationTest2(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");
        
        
        assertEquals(dependent.getName(),"Tom");
        assertEquals(dependent.getDateOfBirth(),"09/03/2002");
        assertEquals(dependent.getAddress(),"1234 Road" );
        assertEquals(dependent.getAlienNum(), 1234);
        assertEquals(dependent.getApplicantName(),"Mary");
        assertEquals(dependent.getApplicantAlienNum(),5678);
        assertEquals(dependent.getApplicantEmail(), "mary@gmail.com");
    }

    /*
     * Creates an empty dependent and sets the values
     */
    @Test
    public void dependentCreationTest3(){

        DependentAddition dependent = DependentAddition.dependentCreation();

        dependent.setName("Tom");
        dependent.setDateOfBirth("09/03/2002");
        dependent.setAddress("1234 Road");
        dependent.setAlienNum(1234);
        dependent.setApplicantName("Mary");
        dependent.setApplicantAlienNum(5678);
        dependent.setApplicantEmail("mary@gmail.com");
        
        assertEquals(dependent.getName(),"Tom");
        assertEquals(dependent.getDateOfBirth(),"09/03/2002");
        assertEquals(dependent.getAddress(),"1234 Road" );
        assertEquals(dependent.getAlienNum(), 1234);
        assertEquals(dependent.getApplicantName(),"Mary");
        assertEquals(dependent.getApplicantAlienNum(),5678);
        assertEquals(dependent.getApplicantEmail(), "mary@gmail.com");

    }


    /**
     * successfully validates because correct dependent information
     */
    @Test
    public void validateDependentTest1(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");
        assertTrue(dependent.validateDependent(dependent));
    }

    /**
     * Has an invalid birthday structure but will pass because the code is set to return false always
     */
    @Test
    public void validateDependentTest2(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");
        assertFalse(dependent.validateDependent(dependent));
    }

    @Test
    public void saveToDBTest(){
        DependentAddition dependent = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");
        assertTrue(dependent.saveToDB(dependent));
    }

    /*
     * Successfully gets a dependent because it has a valid alien number
     */
    @Test
    public void getDependentFromDBTest1(){
        DependentAddition dependent = DependentAddition.getDependentFromDB(5678);
        assertThat(dependent, instanceOf(DependentAddition.class));
    }

    /*
     * Invalid alien number should result in a null, but this test will pass because
     * the function is set to return null always for now.
     */
    @Test
    public void getDependentFromDBTest2(){
        DependentAddition dependent = DependentAddition.getDependentFromDB(-1);
        assertNull(dependent);

    }

    /**
     * returns true because it was updated with a proper dependent object
     */
    @Test
    public void updateDependentTest1(){
        DependentAddition dependent1 = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");

        DependentAddition dependent_updated = DependentAddition.dependentCreation("Tim","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");
        
        assertTrue(dependent1.updateDependent(dependent_updated));
    }

    /*
     * The dependent object we want to update to doesnt have the correct birthday format so we cannot update
     * because the update function will rerun validation.
     */
    @Test
    public void updateDependentTest2(){
        DependentAddition dependent1 = DependentAddition.dependentCreation("Tom","09/03/2002","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");

        DependentAddition dependent_updated = DependentAddition.dependentCreation("Tim","09/03/","1234 Road",
                                1234, "Mary",5678,"mary@gmail.com");

        assertFalse(dependent1.updateDependent(dependent_updated));
    }

    
}
