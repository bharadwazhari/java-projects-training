public class SavingsAccount extends Account {

    @Override
    public String getAccountNumber() {
        return "S"+super.getAccountNumber();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + this.getAccountNumber() + '\'' +
                ", accountType='" + this.getAccountType() + '\'' +
                ", accountBranch='" + this.getAccountBranch() + '\'' +
                '}';
    }
}
