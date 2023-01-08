package OP1.LAB2;

public class Task1 {
    public static void main(String[] args) {

        double a = 4.88;
        double b = -0.54;
        double c = 1.25;
        double d = 0.34;

        // знаходимо косинус з числа с
        double cosc = Math.cos(c);
        // знаходимо корінь з числа d
        double sqrtd = Math.sqrt(d);
        // знаходимо корінь з числа c
        double sqrtc = Math.sqrt(c);
        // // знаходимо логарифм за правилом log2x = log10(x)/log10(2)
        double log1 = Math.log10(sqrtd) / Math.log10(sqrtc);
        // знаходимо значення в другому дробі
        double div = cosc / log1;
        // знаходимо модуль з другого дробу
        double module = Math.abs(div);
        // знаходимо квадратний корінь з отриманого значення
        double sqrt_div = Math.sqrt(module);
        // знаходимо b \ a
        double b_div_a = b / a;
        // знаходимо значення під основним модулем
        double value = b_div_a * sqrt_div;
        // знаходимо модуль з отриманого значення
        double module1 = Math.abs(value);
        // знаходимо логарифм за основою с з всього отриманого виразу за правилом log2x = log10(x)/log10(2)
        double logc = Math.log10(module1) / Math.log10(c);
        System.out.println(logc);

    }
}
