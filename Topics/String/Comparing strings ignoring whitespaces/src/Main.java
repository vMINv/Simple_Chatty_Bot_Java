import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String answer = str1.replace(" ", "").equals(str2.replace(" ", "")) ? "true" : "false";
        System.out.println(answer);
    }
}