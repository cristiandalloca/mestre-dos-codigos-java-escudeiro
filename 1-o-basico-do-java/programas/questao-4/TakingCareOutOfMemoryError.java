public class TakingCareOutOfMemoryError {
    public static void main(String[] args) {
        TakingCareOutOfMemoryError takingCareOutOfMemoryError = new TakingCareOutOfMemoryError();
        takingCareOutOfMemoryError.createArray(100000 * 100000);
    }

    public void createArray(int size) {
        try {
            Integer[] array = new Integer[size];
        } catch (OutOfMemoryError e) {
            System.err.println("Tamanho da array muito grande");
            System.err.println("Mem. Max da JVM: " + Runtime.getRuntime().maxMemory());
        }
    }
}
