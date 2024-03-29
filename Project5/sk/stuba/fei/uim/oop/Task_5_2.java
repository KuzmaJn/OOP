package sk.stuba.fei.uim.oop;
import sk.stuba.fei.uim.oop.entity.*;

public class Task_5_2 {
    public static void main(String[] args) {
        Coin[] coins = {new Coin(2), new Coin(6), new Coin(10)};
        MonetaryAmount amount = new MonetaryAmount();
        amount.setAmount(12);

        System.out.println(amount.canAssemble(coins));
    }

}
