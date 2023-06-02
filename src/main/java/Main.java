public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(7, 7));
        System.out.println(intsCalc.mult(7, 7));
        System.out.println(intsCalc.pow(7, 7));
    }
}