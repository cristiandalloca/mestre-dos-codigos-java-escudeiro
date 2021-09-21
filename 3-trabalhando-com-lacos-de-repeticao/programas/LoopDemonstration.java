public class LoopDemonstration {
    public static void main(String[] args) {

        System.out.println("Utilizando laco de repeticao while...");
        int[] arrayWhile = new int[]{1, 2, 3, 4, 5};
        int indexWhile = 0;
        while (indexWhile < arrayWhile.length) {
            System.out.println("Valor arrayWhile[" + indexWhile + "]: " + arrayWhile[indexWhile]);
            System.out.println();
            indexWhile++;
        }

        System.out.println("Utilizando laco de repeticao for...");
        int[] arrayFor = new int[]{6, 7, 8, 9, 10};
        for (int indexFor = 0; indexFor < arrayFor.length; indexFor++) {
            System.out.println("Valor arrayFor[" + indexFor + "]: " + arrayFor[indexFor]);
            System.out.println();
        }

        System.out.println("Utilizando laco de repeticao enhanced for...");
        int[] arrayEnhancedFor = new int[]{11, 12, 13, 14, 15};
        for (int actualPosition : arrayEnhancedFor) {
            System.out.println("Valor atual: " + actualPosition);
            System.out.println();
        }

        System.out.println("Utilizando laco de repeticao do/while...");
        int[] arrayDoWhile = new int[]{16, 17, 18, 19, 20};
        int indexDoWhile = 0;
        do {
            System.out.println("Valor arrayFor[" + indexDoWhile + "]: " + arrayDoWhile[indexDoWhile]);
            System.out.println();
            indexDoWhile++;
        } while (indexDoWhile < arrayDoWhile.length);

    }
}
