import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        /*
        int dan = 1;
        while(dan < 10){
            System.out.println(dan + "단 출력----------");
            for(int i = 1; i < 10; i++) {
                System.out.println(dan * i);
            }
            dan ++;
        }
         */

        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        if (dan < 2) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else if (dan > 9) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else {

                for(int i = 1; i < 10; i++) {
                    System.out.println(dan * i);
                }

        }


    }
}
