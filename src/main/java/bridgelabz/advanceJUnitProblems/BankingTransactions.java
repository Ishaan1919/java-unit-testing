package bridgelabz.advanceJUnitProblems;

public class BankingTransactions {
    double balance;

    void deposit(double money){

        if(money<0){
            throw new RuntimeException("Negative money can not be deposited");
        }

        this.balance+=money;
//        return this.balance;
    }

    void withdraw(double money){
        if(money<0 || money>this.balance){
            throw new RuntimeException("The balance is insufficient");
        }
        this.balance-=money;
//        return this.balance;
    }

    public double getBalance() {
        return this.balance;
    }
}
