package org.water.practice.gohigher.algorithm;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by water on 8/27/17.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ABSTest {

  @Test
  public void testPlaceHolder() {

    System.out.println(Math.rint(12.5));  //最近的偶数
    System.out.println(Math.rint(11.5));  //最近的偶数.


    // StringBuffer.

    StringBuffer stringBuffer = new StringBuffer("ABC");
    stringBuffer.append("D");
    System.out.println(stringBuffer);


    String a ="";

  }


  @Test
  public void testMax() {
    System.out.println(maxProfit(4,new int[]{1,2,4,2,5,7,2,4,9,0}));


  }








  public int maxProfit(int k, int[] prices) {
    //dp?
    if(prices == null || prices.length == 0 ||k ==0) {
      return 0;
    }
    //来写一个标准的dp.
    int [][][] dp_profit = new int [prices.length][k+1][2];   //最大收益。二维：第0次交易，第一次交易，第二次交易。 三维：0卖出。1买入。
    for(int i=0;i<prices.length;i++) {
      for(int a=0;a<k+1; a++){
        dp_profit[i][a][0]= Integer.MIN_VALUE;  //卖出
        dp_profit[i][a][1]= Integer.MIN_VALUE;  // 买入
      }
    }

    dp_profit[0][0][0] = 0;
    dp_profit[0][0][1] = 0;
    dp_profit[0][1][0]= 0;  //卖出
    dp_profit[0][1][1]= 0 - prices[0];  //买入

    int ret = 0;

    for(int i=1; i<prices.length;i++) {
      dp_profit[i][0][0] = dp_profit[i-1][0][0];
      dp_profit[i][0][1] = dp_profit[i-1][0][0];
      dp_profit[i][1][0] = Math.max(prices[i] + dp_profit[i-1][1][1], dp_profit[i-1][1][0]); //第一次卖出
      dp_profit[i][1][1] = Math.max(0-prices[i], dp_profit[i-1][1][1]);  //第一次买入

      for(int a=2;a<i; a++){
        if(a>k){
          continue;
        }
        dp_profit[i][a][0] = Math.max(dp_profit[i-1][a][1] + prices[i], dp_profit[i-1][a][0]);     // 第二次卖出
        dp_profit[i][a][1] = Math.max(dp_profit[i-1][a-1][0] -prices[i], dp_profit[i-1][a][1]);     // 第二次买入
      }

    }
    int end = prices.length-1;

    for(int i=0;i<k+1;i++) {
      System.out.println(dp_profit[end][i][0]);
      System.out.println("**********");
      ret = Math.max(ret, dp_profit[end][i][0]);
    }
    return ret;

    }




}