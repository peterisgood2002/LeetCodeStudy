package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0066_PLUS_ONE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0066_PLUS_ONE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0066_PLUS_ONE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] digits = new int[] {1, 2, 3};
    	int[] result = new int[] {1, 2, 4};
    	Assert.assertTrue(equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {4, 3, 2, 1};
    	result = new int[] {4, 3, 2, 2};
    	Assert.assertTrue(equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {0};
    	result = new int[] {1};
    	Assert.assertTrue(equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {9,8,7,6,5,4,3,2,1,0};
    	result = new int[] {9,8,7,6,5,4,3,2,1,1};
    	Assert.assertTrue(equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	
    }
    
    public static boolean equalsForArray(int[] a, int[] b ) {
    	if( a.length != b.length) {
    		return false;
    	}
    	
    	for( int i = 0; i < a.length; i++ ) {
    		if( a[i] != b[i] ) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    
   
}
