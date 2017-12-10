public class Diamond{
    public static void main(String[] args){
        int value = 5;
        int countValue=value-1;
        int i2=0;
        int count = 1;
        while (count <= value){
            for (int i=0; i <countValue; ++i){
                System.out.print(" ");
        }
            while (i2 < count*2-1) {
                System.out.println(" * ");
                i2++;
            }
            i2=0;
            countValue-=1;
            System.out.println();
            count++;
        }
        count=1;
        while(count<value) {
            for (int i = 0; i < count; ++i) {
                System.out.println(" ");
            }
            for (int i = 0; i<2 * (value - count)-1; i++) {
                System.out.println("*");
            }
            System.out.println();
            count++;
        }
    }
}


