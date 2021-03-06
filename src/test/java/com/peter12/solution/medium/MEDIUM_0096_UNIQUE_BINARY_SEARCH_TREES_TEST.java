package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.ResultCheck;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {


		Assert.assertEquals(5, MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES.numTrees(3));
		Assert.assertEquals(14, MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES.numTrees(4));
		Assert.assertEquals(42, MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES.numTrees(5));

	}


}
