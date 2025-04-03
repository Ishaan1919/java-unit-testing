package bridgelabz.advanceJUnitProblems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;

public class BankingTransactionsTest {
    double DELTA = 0.001;
    private static BankingTransactions bt = new BankingTransactions();

    @BeforeAll
    public static void instantiate(){
        bt.balance = 90000;
    }

    @ParameterizedTest
    @CsvSource({
            "100.0, 90100.0",
            "1000.0, 91100.0"
    })
    public void depositTest(double money, double expectedBalance){
        bt.deposit(money);
        double balance = bt.getBalance();
        assertEquals(expectedBalance, balance,DELTA);
    }

    public void withdrawTest(){
        bt.withdraw(10000.0);
        double balance = bt.getBalance();
        assertEquals(80000.0,balance,DELTA);
    }
}
