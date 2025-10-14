public class Pattern {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            // spaces for pyramid shape
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }

            // print pattern based on row number
            if (i == 1) {
                System.out.println(num);
                num++;
            } else if (i == 2) {
                System.out.println(ch++ + "   " + ch++);
            } else if (i == 3) {
                System.out.println(num++ + "       " + num++);
            } else if (i == 4) {
                System.out.println(ch++ + "           " + ch++);
            } else if (i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(num++ + "   ");
                }
                System.out.println();
            }
        }
    }
}
