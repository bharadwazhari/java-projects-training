public class CheckingAccount extends Account {

    private String accountType;

    @Override
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String getAccountType() {
        return accountType;
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
