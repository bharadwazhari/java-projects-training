import java.util.Arrays;
import java.util.List;

public class LambdaEx {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("AA","BB","CC", "DD");
        for(String str : list) {
            System.out.println(str);
        }
        System.out.println("*******************************");
        Arrays.asList("AA","BB","CC", "DD").forEach(str -> System.out.println(str));
        System.out.println(Product.sum(100, 200));
        System.out.println(Product.multiply(100, 200));
        Computer computer = new Computer();
        Product product = new Computer();
        System.out.println(product.method1(2000));
        System.out.println(product.minus(5, 2));
        System.out.println(computer.minus(5, 2));
        Square sq = (int x) -> x * x;
        Square sq1 = (int x) -> x * x * x;
        System.out.println(sq.calculate(5));
        System.out.println(sq1.calculate(5));
    }
}
