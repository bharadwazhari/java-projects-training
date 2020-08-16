public class OopsTest {

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static String add(int a, int b, String s) {
        return s+a+b;
    }


    public static void main(String args []) {
        Account c = new CheckingAccount();
        c.setAccountBranch("HimmayatNagar");
        c.setAccountNumber("123456789");
        c.setAccountType("Checking1111");

        Account s = new SavingsAccount();
        s.setAccountBranch("Begumpet");
        s.setAccountNumber("1222222222");
        s.setAccountType("Savings11111");

        System.out.println("checking account details : "+c.toString());
        System.out.println("savings account details : "+s.toString());

        int sum1 = add(100,200);
        int sum2 = add(100,200, 300);
        String sum3 = add(100,200, "300");

        System.out.println("sum1 :"+ sum1);
        System.out.println("sum2 : " +sum2);
        System.out.println("sum3 : " +sum3);
    }
}
