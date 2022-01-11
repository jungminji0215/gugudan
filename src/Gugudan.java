public class Gugudan {
    public static void main(String[] args) {
        int[] gugudan = new int[9];

        for(int i = 0; i < gugudan.length; i++){
            gugudan[i] = 2 * (i+1);
        }

        for(int i = 0; i < gugudan.length; i++){
            System.out.println(gugudan[i]);
        }
    }
}
