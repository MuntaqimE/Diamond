public class OddNumbersLoop {
    public static void main (String[] args){
        for (int x = 1; x<=170; x+=8){
            System.out.println(x + " ");
            if ((x+1) % 7 == 0){
                System.out.println();
            }
        }
    }
}
