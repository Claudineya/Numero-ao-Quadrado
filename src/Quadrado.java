public class Quadrado {
    public static int quadrado(int a) {
        System.out.println("quadrado de int: "+ a );
        return a * a;
    }
    public static double quadrado(double a ) {
        System.out.println("Quadrado de double: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        quadrado(6*6);
        quadrado(5.7*6);
    }
}
