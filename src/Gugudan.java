import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        int dan = 1;

        while(dan < 10){
            System.out.println(dan + "단 출력----------");
            for(int i = 1; i < 10; i++) {
                System.out.println(dan * i);
            }
            dan ++;
        }

    }
}
