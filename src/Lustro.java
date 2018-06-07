import java.util.Random;

public class Lustro {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random rand = new Random();

        for(int i=0; i<tab.length; i++){
            tab[i]=rand.nextInt(10);
        }

        int x=1;

        for(int i=0; i<tab.length*2; i++){
            if(i<tab.length){
                System.out.print(tab[i]);
            } else {
                System.out.print(tab[i-x]);
                x=x+2;
            }
        }

    }
}
