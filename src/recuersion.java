public class recuersion {
    public static void printNumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String args[]) {
        int y = 1;

        printNumb(y);
    }

}
