import java.util.*;

import static java.lang.System.out;

public class MapsInterfaceExamples {
    public static void main(String[] args) {

        out.println("HashTable...");
        /*
         * Implementação sincronizada, ou seja, thread safe;
         * Não permite nem chaves e nem valores nulos;
         * Utilizar quando a aplicação utiliza vários objetos em thread's diferentes assincronas, porém atualmente é
         *   aconselhado utilizar o objeto ConcurrentHashMap, ao invés do Hashtable...
         * */
        Map<Integer, String> numbersName = new Hashtable<>();
        numbersName.put(0, "Zero");
        numbersName.put(1, "Um");
        numbersName.put(2, "Dois");
        numbersName.put(3, "Três");

        numbersName.forEach((key, value) -> {
            out.println("Key: " + key + " Value: " + value);
        });

        out.println();

        out.println("HashMap...");

        /*
         * Implementação não sincronizada, ou seja, não é thread safe;
         * Permite apenas uma chave nula, e vários valores nulos;
         * Utilizar quando a aplicação não utiliza vários objetos em threads diferentes
         * */

        Map<String, Double> notasDeAlunos = new HashMap<>();
        notasDeAlunos.put("Maria", 5.7);
        notasDeAlunos.put("José", 7.0);
        notasDeAlunos.put("Maurício", 9.5);
        notasDeAlunos.put("Amanda", 6.5);

        Double media = notasDeAlunos.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        notasDeAlunos.forEach((key, value) -> {
            out.println("Key: " + key + " Value: " + value);
        });
        out.printf("Média das notas: %.2f%n", media);

        out.println();

        out.println("LinkedHashMap...");
        /*
         * Sub classe do HashMap, diferente do HashMap, o LinkedHashMap mantém a ordem de inserção dos elementos
         * Utilizar quando é necessário manter a ordem de inserção dos elementos
         * */

        Map<Integer, String> posicaoFilaNome = new LinkedHashMap<>();
        posicaoFilaNome.put(1, "Maria");
        posicaoFilaNome.put(2, "José");
        posicaoFilaNome.put(3, "Gustavo");
        posicaoFilaNome.put(4, "Márcia");

        out.println("Fila atual: ");
        posicaoFilaNome.values().forEach(out::println);

        out.println();

        out.println("TreeMap...");
        /*
         * Mantém ordem crescente da Key, não permite key nulas, porém permite valores nulos
         * Baseada na implementação da binária rubro-negra
         * Utilizar quando a ordenação é necessária para o map de keys
         * */
        TreeMap<String, Double> programmingLanguageNotes = new TreeMap<>();
        programmingLanguageNotes.put("Java", 9.0);
        programmingLanguageNotes.put(".Net", 5.0);
        programmingLanguageNotes.put("Python", 3.0);
        programmingLanguageNotes.put("PHP", 7.0);
        programmingLanguageNotes.put("Cobol", 2.0);

        programmingLanguageNotes.forEach((key, value) -> {
            out.println("Key: " + key + " Value: " + value);
        });

        out.println("Ordem decrescente de inserção: ");
        out.println(programmingLanguageNotes.descendingMap());
        out.println("Linguagens de programação abaixo do Python: ");
        out.println(programmingLanguageNotes.headMap("Python"));
        out.println("Linguagens de programação acima do Python");
        out.println(programmingLanguageNotes.tailMap("Python"));
        out.println("Linguagens de programação entre o .Net e PHP");
        out.println(programmingLanguageNotes.subMap(".Net", "PHP"));

    }
}
