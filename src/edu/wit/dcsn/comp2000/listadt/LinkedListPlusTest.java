/*
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab 4: List ADT
 * Spring, 2019
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 * 
 * Further, you may not post or otherwise share this code with anyone other than
 * current students in my sections of this course. Violation of these usage
 * restrictions will be considered a violation of the Wentworth Institute of
 * Technology Academic Honesty Policy.
 */


package edu.wit.dcsn.comp2000.listadt;

import static org.junit.jupiter.api.Assertions.* ;

import org.junit.jupiter.api.AfterAll ;
import org.junit.jupiter.api.AfterEach ;
import org.junit.jupiter.api.BeforeAll ;
import org.junit.jupiter.api.BeforeEach ;
import org.junit.jupiter.api.DisplayName ;
import org.junit.jupiter.api.Test ;
import org.junit.jupiter.api.TestInfo ;

import edu.wit.dcsn.comp2000.listadt.LinkedListPlus ;
import edu.wit.dcsn.comp2000.listadt.ListInterface ;


/**
 * JUnit tests for the LinkedListPlus class.  All public and package visible methods are 
 * tested.  These tests require the API for the LinkedListPlus class implement 
 * ListInterface&lt;T&gt; and Iterable&lt;T&gt;.
 * 
 * @author	David M Rosenberg
 * @version	0.1.0 2018-07-11	placeholder
 * @version	0.1.0 2018-07-22	minor fix required due to correction to ListInterface
 */
class LinkedListPlusTest
	{
	/*
	 * counters and labels
	 */
	// overall
	static final String TEST_CLASS_NAME =		"LinkedListPlus" ;
	
	static int totalTestsAttempted =			0 ;
	static int totalTestsSucceeded =			0 ;
	
	// current test group/method
	int currentTestsAttempted ;
	int currentTestsSucceeded ;
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception
		{
		// display start of testing (class)
		System.out.printf( "Starting tests of class %s%n%n",
		                   TEST_CLASS_NAME
		                   ) ;
		
		}	// end setUpBeforeClass()


	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception
		{
		// display summary results
		if ( totalTestsAttempted > 0 )
			{
    		System.out.printf( "Successfully completed %,d of %,d tests (%d%%) attempted for class %s%n",
    							totalTestsSucceeded,
    							totalTestsAttempted,
    							( totalTestsSucceeded * 100 ) / totalTestsAttempted,
    							TEST_CLASS_NAME
    							) ;
			}
		else
			{
			System.out.printf( "No tests attempted for class %s%n",
			                    TEST_CLASS_NAME
			                    ) ;
			}
		
		}	// end tearDownAfterClass()


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp( TestInfo testInfo ) throws Exception
		{
		// reset current test counters
		currentTestsAttempted =		0 ;
		currentTestsSucceeded =	0 ;
		
		// display start of testing (method or category/group of operations)
		System.out.printf( "Starting %s tests%n%n",
							testInfo.getDisplayName()
							) ;
		
		}	// end setUp()


	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown( TestInfo testInfo ) throws Exception
		{
		// display stats for this test group
		System.out.printf( "%nSuccessfully completed %,d of %,d tests (%d%%) for %s%n%n----------%n%n",
							currentTestsSucceeded,
							currentTestsAttempted,
							( currentTestsSucceeded * 100 ) / currentTestsAttempted,
							testInfo.getDisplayName() ) ;
		
		// accumulate this test group's results
		totalTestsAttempted +=		currentTestsAttempted ;
		totalTestsSucceeded +=		currentTestsSucceeded ;
		}	// end tearDown()


	// test methods
	

	/**
	 * Test method for instantiating lists.
	 */
	@Test
	@DisplayName( "Instantiate List" )
	void testInstantiateList()
		{
		ListInterface<String> testList ;
		
		/* ----- */
		
		System.out.println( "Testing: LinkedListPlus()" ) ;
		currentTestsAttempted++ ;
		
		testList =					null ;	// reset the pointer
		testList =					new LinkedListPlus<>() ;
		
		assertNotNull( testList ) ;
		assertTrue( testList.isEmpty() );
		
		currentTestsSucceeded++ ;
		System.out.println( "...passed" ) ;
		
		}	// end testInstantiateList()

	}
