public class EvenNumbersLoop {
    public static void main(String[] args){
        int y = 0;
        while (y<=200){
            System.out.println(" " + y);
            y += 2;
            if (y % 20==0)
                System.out.println();
        }
    }
}
