package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.ListNodeData;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0278_FIRST_BAD_VERSION_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0278_FIRST_BAD_VERSION_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0278_FIRST_BAD_VERSION_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {

    	EASY_0278_FIRST_BAD_VERSION.badVersion = 2;
    	Assert.assertEquals(EASY_0278_FIRST_BAD_VERSION.badVersion, EASY_0278_FIRST_BAD_VERSION.firstBadVersion(3) );
    	
    	
    	EASY_0278_FIRST_BAD_VERSION.badVersion = 1702766719;
    	Assert.assertEquals(EASY_0278_FIRST_BAD_VERSION.badVersion, EASY_0278_FIRST_BAD_VERSION.firstBadVersion(2126753390) );
    	
    	EASY_0278_FIRST_BAD_VERSION.badVersion = 4;
    	Assert.assertEquals(EASY_0278_FIRST_BAD_VERSION.badVersion, EASY_0278_FIRST_BAD_VERSION.firstBadVersion(5) );
    	
    	EASY_0278_FIRST_BAD_VERSION.badVersion = 1;
    	Assert.assertEquals(EASY_0278_FIRST_BAD_VERSION.badVersion, EASY_0278_FIRST_BAD_VERSION.firstBadVersion(1) );
    	
    	
    	
     	
    }
    
   
   
}
