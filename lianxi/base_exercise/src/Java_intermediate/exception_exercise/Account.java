package Java_intermediate.exception_exercise;
/*这是一个类图
Account类： 银行账号
属性： balance 余额
方法： getBalance() 获取余额
方法： deposit() 存钱
方法： withdraw() 取钱
OverdraftException： 透支异常，继承Exception
属性： deficit 透支额*/
public class Account {
    private int balance;
    private int deficit;


    public void deposit(int money){

    }
    public int withdraw(int money){

        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    class OverdraftException extends Exception{
        public void message(String s){

        }
    }
}
