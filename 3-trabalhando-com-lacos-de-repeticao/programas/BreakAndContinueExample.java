import java.util.Random;

public class BreakAndContinueExample {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = random.ints(10, 10, 100 * 100).toArray();

        System.out.println("Demonstracao break...");
        for (int index = 0; index < array.length; index++) {
            if (index == (array.length / 2)) { // Na metade da iteração das posições da array eu saio (break) do for
                System.out.println("Saindo do laco... (break)");
                break;
            }
            System.out.println("Valor atual: " + array[index]);
        }

        System.out.println("Demonstracao continue...");
        for (int index = 0; index < array.length; index++) {
            if (index < (array.length / 2)) { // "Pulando" (continue) a metade dos elementos da array
                System.out.println("Continuando do laco... (continue)");
                continue;
            }
            System.out.println("Valor atual: " + array[index]);
        }

    }
}
