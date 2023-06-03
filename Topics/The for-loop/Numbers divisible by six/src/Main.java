import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num0 = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<num0; i++){
            int num = scanner.nextInt();
            if(num%6==0){
                sum += num;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}