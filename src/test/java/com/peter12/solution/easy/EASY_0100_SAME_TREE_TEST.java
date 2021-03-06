package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0100_SAME_TREE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0100_SAME_TREE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0100_SAME_TREE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums1 = new int[] {1, 2, 3, 4, 5, 6};
    	int[] nums2 = new int[] {1, 2, 3};
    	
    	TreeNode t1 = TreeNode.createTreeNode(nums1);
    	TreeNode t2 = TreeNode.createTreeNode(nums2);
    	
    	Assert.assertTrue( EASY_0100_SAME_TREE.isSameTree(t1, t2) );
    	
    	
    }
  
}
