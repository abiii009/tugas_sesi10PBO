public class Exception5 {

    public static void main(String[] args) {

        int bil = 10;

        try {

            System.out.println(bil / 0);

        } catch (ArithmeticException e) {

            System.out.println("Pesan Error:");
            System.out.println(e.getMessage());

            System.out.println("\nStack Trace:");
            e.printStackTrace();

        }

        System.out.println("Program selesai.");

    }
}