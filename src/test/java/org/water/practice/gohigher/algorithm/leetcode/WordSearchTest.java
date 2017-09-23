package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/15/17.
 */
public class WordSearchTest {

  @Test
  public void testExist() throws Exception {


    WordSearch wordSearch = new WordSearch();
    char[] c1 = new char[]{'C','A','A'};
    char[] c2 = new char[]{'A','A','A'};
    char[] c3 = new char[]{'B','C','D'};

    char[][] cc = new char[][] {c1, c2, c3};


    boolean exist =  wordSearch.exist(cc, "AAB");

    System.out.println(exist);


  }
}