package org.water.practice.gohigher.algorithm.leetcode;

import java.util.Arrays;

/**
 * Created by water on 9/15/17.
 */
public class WordSearch {


  boolean exist = false;
  static boolean[][] visited;
  public boolean exist(char[][] board, String word) {
    visited = new boolean[board.length][board[0].length];
    //1. 每个字符只能用一次， 横竖相邻。

    // 2. 思路一，循环两层遍历。第一个字符串找到后，dfs ,遍历完了 返回结果值. 大概O（M*N*K）
    //    思路二， 没什么别的思路。。

    // 3. 开搞

    int m = board.length;
    if(m == 0) {
      return exist;
    }

    for (int i =0; i< m ; i++) {
      int n = board[i].length;


      for (int j=0; j<n ; j ++) {
        checkExist(board, i, j, word);
      }

    }

    return exist;

  }
  private void checkExist(char[][] board, int i, int j, String word) {
    if (word.length() == 0) {
      exist = true;
      return;
    }
    if (i< 0 || j <0 || i>=board.length || j>= board[i].length  ||visited[i][j]) {
      return;
    }

    visited[i][j] = true;
    if(board[i][j] == word.charAt(0)) {

      word = word.substring(1);
      checkExist(board, i, j+1, word);
      checkExist(board, i, j-1, word);
      checkExist(board, i+1, j, word);
      checkExist(board, i-1, j, word);
    }
    visited[i][j] = false;
    return ;


  }

}
