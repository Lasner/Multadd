/**
 * Created by Lauri on 18.11.2016.
 */
public class Multadd {
    public static double multadd(double a, double b, double c){
        return (a * b + c);

    }

    public static double expSum(double x){
        double ex = Math.exp(-x);
        double sqrt = Math.sqrt(1-ex);

        return multadd(x, ex, sqrt );
    }
    public static void main(String[]args){

        double multadd = multadd(6, 2, 3);
        System.out.println(multadd);
        double expSum = expSum(4);

        System.out.println(expSum);
    }
}
