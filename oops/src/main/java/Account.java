public class Account {

    private String accountNumber;
    private String accountType;
    private String accountBranch;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

    public void setAccountBranch(String accountBranch) {
        this.accountBranch = accountBranch;
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
