public class Lab8 {

    public static void main(String[] args) {
        // клас QuadEquationSolve_Discr як нащадник класа QuadEquationSolve
        // використувує static block з надписом "Let`s begin!"
        QuadEquationSolve_Discr qsd = new QuadEquationSolve_Discr(2, 1, -4);
        printRoots(qsd);

        // демонструємо overload конструктора класа QuadEquationSolve в класі
        // QuadEquationSolve_Discr (аргумент b ініціюється нульовим значенням)
        qsd = new QuadEquationSolve_Discr(1, -4);
        printRoots(qsd);

        // демонструємо mutable екземпляра qsd класа QuadEquationSolve_Discr
        qsd.set_a(2);
        qsd.set_b(1);
        qsd.set_c(-20);
        printRoots(qsd);
    }

    static void printRoots(QuadEquationSolve_Discr qsd) {
        System.out.println("Roots of a quadratic equation (a = " + qsd.get_a() + ", b = " + qsd.get_b() + ", c = "
                + qsd.get_c() + "):");
        double[] roots = qsd.solve();
        for (int i = 0; i < roots.length; i++) {
            System.out.print(roots[i] + " ");
        }
        System.out.println();
    }
}

abstract class QuadEquationSolve {
    private double a;
    private double b;
    private double c;

    QuadEquationSolve(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static {
        // static block
        System.out.println("Let's begin!");
    }

    public double get_a() {
        return a;
    }

    public double get_b() {
        return b;
    }

    public double get_c() {
        return c;
    }

    public void set_a(double x) {
        a = x;
    }

    public void set_b(double x) {
        b = x;
    }

    public void set_c(double x) {
        c = x;
    }

    public abstract double[] solve();
}

class QuadEquationSolve_Discr extends QuadEquationSolve {
    QuadEquationSolve_Discr(double a, double b, double c) {
        super(a, b, c);
    }

    // це overload
    QuadEquationSolve_Discr(double a, double c) {
        super(a, 0, c);
    }

    @Override
    public double[] solve() {
        double d = Math.pow(get_b(), 2) - 4 * get_a() * get_c();
        double[] res = {};
        if (d > 0) {
            res = new double[] { (-get_b() + Math.sqrt(d)) / (2 * get_a()), (-get_b() - Math.sqrt(d)) / (2 * get_a()) };
        } else if (d == 0) {
            res = new double[] { -get_b() / (2 * get_a()) };
        }
        return res;
    }
}
