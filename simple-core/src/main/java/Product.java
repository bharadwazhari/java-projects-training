/*
public interface Product {
  public abstract int method1(int);
  public abstract void method2();
  public abstract void method3();
}
 */
public interface Product {
    int method1(int i);
    public void method2();
    abstract void method3();
    //default & static
    static int sum(int a, int b) {
        return a+b;
    }
    static int multiply(int a, int b) {
        return a*b;
    }

    default int minus(int a, int b) {
        return a-b;
    }

    default int minus2(int a, int b) {
        return a-b;
    }

    default int minus3(int a, int b) {
        return a-b;
    }
}
