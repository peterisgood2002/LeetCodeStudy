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
public class EASY_0172_FACTORIAL_TRAILING_ZEROES_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0172_FACTORIAL_TRAILING_ZEROES_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0172_FACTORIAL_TRAILING_ZEROES_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals(49, EASY_0172_FACTORIAL_TRAILING_ZEROES.trailingZeroes(200));
    	Assert.assertEquals(7, EASY_0172_FACTORIAL_TRAILING_ZEROES.trailingZeroes(30));
    	Assert.assertEquals(0, EASY_0172_FACTORIAL_TRAILING_ZEROES.trailingZeroes(3));
    	Assert.assertEquals(1, EASY_0172_FACTORIAL_TRAILING_ZEROES.trailingZeroes(5));
    	Assert.assertEquals(0, EASY_0172_FACTORIAL_TRAILING_ZEROES.trailingZeroes(0));
    }
    
   
   
}
