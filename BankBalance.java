public class BankBalance {
    private Double currentAmount;

    public BankBalance(Double amount) {
        this.currentAmount = amount;
    }

    public Double getAmount() {
        return currentAmount;
    }

    public Double add(Double amount) {
        return this.currentAmount += amount;
    }

    public Double substract(Double amount) {
        return this.currentAmount -= amount;
    }

    @Override
    public String toString() {
        return "Current bank balance : " + currentAmount.toString();
    }
}
