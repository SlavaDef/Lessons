package Mod3;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double D = b * b - 4 * a * c; // формула дискриминанта

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a); // если дискриминант больше 0 - 2 корня
            x2 = (-b + Math.sqrt(D)) / (2 * a);
return  new double[] {x1,x2};

        } else if (D == 0) { // если дискриминант равен 0 - 1 корень
            double x;
            x = -b / (2 * a);
return new double[] {x};
        }
            return new double[]{};





    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(new QuadraticEquationSolver().solve(1,12,36)));

    }
}
