public class IT24102730Lab7Q2B {
    public static void main(String[] args) {

        int count , i;

        for (count = 1; count <= 5; count++) {
            System.out.print(count + "-");

            for (i = 1; i <= count; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}