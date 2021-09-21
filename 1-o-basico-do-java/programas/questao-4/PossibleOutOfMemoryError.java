public class PossibleOutOfMemoryError {
    public static void main(String[] args) {
        PossibleOutOfMemoryError possibleOutOfMemoryError = new PossibleOutOfMemoryError();
        possibleOutOfMemoryError.createArray(100000 * 100000);
    }

    public void createArray(int size) {
        Integer[] array = new Integer[size];
    }
}
