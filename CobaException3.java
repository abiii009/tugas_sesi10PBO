public class CobaException3 {

    public static void main(String[] args) {

        int bil = 10;

        try {

            System.out.println(bil / 0);

        } catch (ArithmeticException e) {

            System.out.println("Terjadi ArithmeticException");

        } catch (Exception e) {

            System.out.println("Terjadi Exception");

        }

        System.out.println("Program selesai.");
    }
}