import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        long random10DigitNumber = generateTenDigitRandomNumber();

        System.out.println("random number are " + random10DigitNumber);

    }

    public static long generateTenDigitRandomNumber(){

        Random random = new Random();


        long min = 100000000L;
        long max = 9999999999L;

        long random10DigitNumber = min + ((long) (random.nextDouble() *(max - min +1)));

        return random10DigitNumber;

    }
}
