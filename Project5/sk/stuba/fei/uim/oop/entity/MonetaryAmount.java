package sk.stuba.fei.uim.oop.entity;

public class MonetaryAmount {
    private int amount;

    public MonetaryAmount(){        // default constructor
        this.amount = 0;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void add(Coin coin){
        this.amount += coin.getValue();
    }
    public void sub(Coin coin){
        this.amount -= coin.getValue();
    }

    public MonetaryAmount copy() {
        MonetaryAmount copy = new MonetaryAmount();
        copy.amount = this.amount;
        return copy;
    }

    public boolean canAssemble(Coin[] coins){
        boolean result = false;
        for(Coin coin : coins){
            if(this.amount - coin.getValue() >= 0){
                this.amount -= coin.getValue();
                if(this.amount == 0){
                    result = true;
                    this.amount += coin.getValue();
                    return result;
                }
                if(canAssemble(coins)){
                    result = true;
                    this.amount += coin.getValue();
                    return result;
                }
                this.amount += coin.getValue();
            }
        }
        return result;
    }
}
