public class Utama {

    public static void main(String[] args) {

        Test3 obj = new Test3();

        obj.methodA();

        try {

            obj.methodB();

        } catch (Exception e) {

            System.out.println("Error di Method B");

        } finally {

            System.out.println("Ini selalu dicetak");

        }

    }

}