package org.water.practice.gohigher.concurrent;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by water on 10/12/17.
 */
public class Bank {

  private int money; //可能需要用更复杂的金额类.



  public  synchronized void saveMoney(){

    money = money + 100;
    System.out.println("存进来100快,当前余额:" + money);


  }


  public synchronized void getMoney(){

    money = money - 100;
    System.out.println("取走100块,当前余额:" + money);
  }


  public static void main(String[] args) {

    Bank bank = new Bank();
    Dad dad = new Dad(bank);
    Son son = new Son(bank);

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    executorService.submit(dad);
    executorService.submit(son);

    try {
      executorService.shutdown();
//      executorService.awaitTermination(20, TimeUnit.SECONDS);

    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}


class Dad extends Thread{
  private Bank bank ;
  public Dad(Bank bank) {
    this.bank = bank;
  }

  @Override
  public void run() {

    int i=5;
    while (i>0) {
      try {

        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      bank.saveMoney();

      i--;
    }
  }
}

class Son extends Thread{

  private Bank bank ;
  public Son(Bank bank) {
    this.bank = bank;
  }

  @Override
  public void run() {
    int i=5;
    while(i>0) {
      try {
//        Random random  = new Random();
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      bank.getMoney();
      i--;
    }
  }
}


// ------------------------------------------------------------------------------------------------

//以下是转账功能的伪代码.

  /*


public synchronized void transfer(Account from, Account to, int money) {
  try {
    //startTransaction.
    db.startTransaction();

    from.setMoney(from.getMoney - money);
    to.setMoney(to.getMoney + money);

    db.update(from);
    db.update(to);
    //提交事务.
    db.commmit();
  } catch (Exception e) {
    //回滚事务
    db.rollback();
  } finally {
    //关闭数据库连接.
    db.close();
  }

}





class AccountService {
  //转账事务
  public static void transfer(String fromName, String toName, double balance){
    try {
      //开启事务
      JDBCUtils.startTransaction();

      AccountDao dao = new AccountDao();
      //查询两个账户的金额
      Account accountFrom = dao.find(fromName);
      Account accountTo = dao.find(toName);
      //判断是否可以转账
      if(balance<accountFrom.getMoney()){
        //可以转账
        //设置转出账户的金额
        accountFrom.setMoney(accountFrom.getMoney()-balance);
        //设置转入账户的金额
        accountTo.setMoney(accountTo.getMoney()+balance);
        //执行数据库更改操作
        dao.update(accountFrom);
        dao.update(accountTo);
        //提交事务
        JDBCUtils.commit();
        System.out.println("事务提交成功");
      }else{
        System.out.println("转出账户金额不足");
      }

    } catch (Exception e) {
      //回滚事务
      JDBCUtils.rollback();
      System.out.println("事务提交失败");
      e.printStackTrace();
    }finally{
      //释放资源
      JDBCUtils.close();
    }
  }

}

 */



