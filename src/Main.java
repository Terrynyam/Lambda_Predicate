import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> p = x->x%2==0;
        Predicate<Integer> p1 = x->x>15;
        System.out.println(p.and(p1).test(10));
        System.out.println(p.and(p1).test(15));
        System.out.println(p.and(p1).test(20));
    }
}