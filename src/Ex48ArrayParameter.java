public class Ex48ArrayParameter {
    static void replaceSpace(char a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                a[i] = '.';
            }
        }
    }

    static void printCharArray(char a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char c[] = {'H', 'E', 'L', 'L', 'O'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
