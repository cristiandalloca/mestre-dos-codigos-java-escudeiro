public class ArraysExamples {
    public static void main(String[] args) {
        
        // Long 
        // Declaração array
        System.out.println("Declaracao array long...");
        long[] longArray = new long[5];
        System.out.println();

        System.out.println("Declaracao array Long...");
        Long[] longWrapperArray = new Long[5];
        System.out.println();

        // Integer 
        // Declaração array
        System.out.println("Declaracao array int...");
        int[] intArray = new int[5];
        System.out.println();

        System.out.println("Declaracao array Integer...");
        Integer[] integerWrapperArray = new Integer[5];
        System.out.println();

        // Inicializar array
        System.out.println("Inicializando array long");
        long[] longInicializationArray  = new long[]{10L, 9L, 88L, 44L};
        System.out.println();
        
        System.out.println("Inicializando array Long");
        Long[] longWrapperInicializationArray = new Long[]{89L, 77L, 23L, 4L};
        System.out.println();

        // Inicializar array
        System.out.println("Inicializando array int");
        int[] intInicializationArray  = new int[]{1, 2, 3, 4};
        System.out.println();
        
        System.out.println("Inicializando array Integer");
        Integer[] integerWrapperInicializationArray = new Integer[]{5, 6, 7, 8};
        System.out.println();

        // Acessar posições de uma array
        System.out.println("Acessando posicoes diretamente long ...");
        System.out.println("Posicao 0: " + longInicializationArray[0]);
        System.out.println("Posicao 1: " + longInicializationArray[1]);
        System.out.println("Posicao 2: " + longInicializationArray[2]);
        System.out.println();

        System.out.println("Acessando posicoes diretamente Long ...");
        System.out.println("Posicao 0: " + longWrapperInicializationArray[0]);
        System.out.println("Posicao 1: " + longWrapperInicializationArray[1]);
        System.out.println("Posicao 2: " + longWrapperInicializationArray[2]);
        System.out.println();

        System.out.println("Acessando posicoes diretamente int ...");
        System.out.println("Posicao 0: " + intInicializationArray[0]);
        System.out.println("Posicao 1: " + intInicializationArray[1]);
        System.out.println("Posicao 2: " + intInicializationArray[2]);
        System.out.println();

        System.out.println("Acessando posicoes diretamente Integer ...");
        System.out.println("Posicao 0: " + integerWrapperInicializationArray[0]);
        System.out.println("Posicao 1: " + integerWrapperInicializationArray[1]);
        System.out.println("Posicao 2: " + integerWrapperInicializationArray[2]);
        System.out.println();

        // Percorrendo array's
        System.out.println("Percorrendo array long...");
        for (long current : longInicializationArray) {
            System.out.print("[" + current + "] ");
        }
        System.out.println();

        System.out.println("Percorrendo array Long...");
        for (Long current : longWrapperInicializationArray) {
            System.out.print("[" + current + "] ");
        }
        System.out.println();

        System.out.println("Percorrendo array int...");
        for (int current : intInicializationArray) {
            System.out.print("[" + current + "] ");
        }
        System.out.println();

        System.out.println("Percorrendo array Integer...");
        for (Integer current : integerWrapperInicializationArray) {
            System.out.print("[" + current + "] ");
        }
        System.out.println();
    }
}
