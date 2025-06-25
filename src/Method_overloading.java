public class Method_overloading {

    static int addMethod(int x, int y) {
        return x + y;

    }

    static double addMethod(double x, double y) {
        return x + y;
    }


    public static void main(String[] args) {

        int mytot = addMethod(6,7);

        System.out.println(mytot);

        double mytot1 = addMethod(5,52);

        System.out.println(mytot1);

    }
}