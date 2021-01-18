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
public class EASY_0169_MAJORITY_ELEMENT_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0169_MAJORITY_ELEMENT_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0169_MAJORITY_ELEMENT_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums = new int[] {6, 5, 5};
    	Assert.assertEquals(5, EASY_0169_MAJORITY_ELEMENT.majorityElement(nums));
    	
    	nums = new int[] {3,2,3 };
    	Assert.assertEquals(3, EASY_0169_MAJORITY_ELEMENT.majorityElement(nums));
    	
    	 nums = new int[] {2, 2, 1, 1, 1, 2, 2 };
     	Assert.assertEquals(2, EASY_0169_MAJORITY_ELEMENT.majorityElement(nums));
    	
    }
    
   
   
}