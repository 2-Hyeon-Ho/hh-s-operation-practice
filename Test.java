public class Test {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(Sigma.sigma(1, 10, 1));
        System.out.println(Pi.pi(1, 10, 1));
        System.out.println(PostfixDecrease.postfixDecrease(i));
        System.out.println(PostfixIncrease.postfixIncrease(i));
        System.out.println(PrefixDecrease.prefixDecrease(i));
        System.out.println(PrefixIncrease.prefixIncrease(i));
    }
}
