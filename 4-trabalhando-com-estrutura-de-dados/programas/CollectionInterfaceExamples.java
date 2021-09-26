import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionInterfaceExamples {
    public static void main(String[] args) {

        System.out.println("Instanciando Set's...");
        System.out.println();
        /*
            Set's não permitem elementos duplicados
            Não são sincronizados
            Não é possível acessar elementor por posição
        */

        System.out.println("\tHashSet...");
        Set<String> hashSet = new HashSet<>();
        System.out.println();
        /*
            Não mantem a ordem de insersão de elementos;
            Melhor desempenho que o LinkedHashSet e TreeSet;
            Permite no máximo um elemento nulo;
            Requer menos memória que um LinkedHashSet e TreeSet;
            Utilizar quando você não precisa manter as ordens de inserção dos elementos.
        */


        System.out.println("\tLinkedHashSet...");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println();
        /*
            Mantém a ordem de inserção de elementos;
            Desempenho menor que o HashSet e maior TreeSet;
            Permite no máximo um elemento nulo;
            Requer mais memória que um HashSet;
            Utilizar quando você precisa manter as ordens de inserção dos elementos.
        */
        System.out.println("\tTreeSet..");
        Set<String> treeSet = new TreeSet<>();
        System.out.println();
        /*
            Mantém a ordem de inserção de elementos de acordo com um Comparator, por padrão a ordem é ascendente;
            Desempenho menor que o HashSet e menor LinkedHashSet;
            Não permite nenhum elemento nulo;
            Requer mais memória que um HashSet;
            Utilizar quando vc precisa ordenar elementos de acordo com um Comparator.
        */

        
        System.out.println("Instanciando List's...");
        System.out.println();
        /*
            List's permitem elementos duplicados
            É uma sequência ordenada
            É possível acessar elementos por posição
            É possível armazenar multiplos elementos nulos
            Utilizar quando é necessário o armazenamento de elementos duplicados e nulos
        */

        System.out.println("\tArrayList...");
        List<String> arrayList = new ArrayList<>();
        System.out.println();
        /*
            Possui dimensionamento dinâmico;
            São assíncronas
        */

        System.out.println("\tVector...");
        List<String> vector = new Vector<>();
        System.out.println();
        /*
            Possui dimensionamento dinâmico, porém menos eficaz que o ArrayList;
            É sincrono
            Preferencialmente utilizar ArrayList ao invés do Vector
        */

        System.out.println("\tLinkedList...");
        List<String> linkedList = new LinkedList<>();
        System.out.println();
        /*
            Melhor para manipulação de informações pois usa uma lista dupla vinculada
            Requer mais memória
            Pode atuar como lista e fila
            Utilizar quando é necessário várias ações de manipulação (mais performance)
        */

        System.out.println("Instanciando Queue's...");
        System.out.println();
        /* 
            Utilizado para manipulações de filas (todos elementos são inseridos ao final e removidos do inicio da fila)
            Ordenado
        */

        System.out.println("\tLinkedList...");
        Queue<String> linkedListQueue = new LinkedList<>();
        System.out.println();
        /* 
            
        */

        System.out.println("\tPriorityQueue...");
        Queue<String> priorityQueue = new PriorityQueue<>();
        System.out.println();
        /*
            Os elementos são processados por prioridade
            Não permite nulo
        */
    }
}