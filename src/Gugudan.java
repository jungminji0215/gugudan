import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        int result = dan * 1;
        System.out.println(result);
        result = dan * 2;
        System.out.println(result);
        result = dan * 3;
        System.out.println(result);
        result = dan * 4;
        System.out.println(result);
        result = dan * 5;
        System.out.println(result);
        result = dan * 6;
        System.out.println(result);
        result = dan * 7;
        System.out.println(result);
        result = dan * 8;
        System.out.println(result);
        result = dan * 9;
        System.out.println(result);
    }
}
