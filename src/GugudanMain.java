public class GugudanMain {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();

        for (int j = 2; j < 10; j++) {
            // Gugudan의 calculate와 print 메소드 활용해 구구단 구현하기
            // Gugudan.calculate(j)와 같이 메소드를 호출할 수 있음.
            System.out.println("----------" + j +"단 ----------");
            int[] result = gugudan.calculate(j);
            gugudan.print(result);
        }
    }
}