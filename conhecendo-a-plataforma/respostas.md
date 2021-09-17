1.  
    - Tipos primitivos não permitem valores nulos, ao contrário de classes Wrapper;
    - Tipos primitivos requerem menos memória se comparado a classes Wrapper;
    - Classes Wrapper podem ser utilizadas com coleções (ArrayList, etc...);
    - Classes Wrapper são objetos, enquanto tipos primitivos não são objetos;
    - Classes Wrapper possuem métodos para conversão entre tipos primitivos e Wrapper;

    -   Primitivo   |   Classe Wrapper
        byte        |   Byte
        short       |   Short
        int         |   Int
        long        |   Long
        float       |   Float
        double      |   Double
        char        |   Char
        boolean     |   Boolean

    - Todas classes Wrapper possuem valor default nulo (null). Enquanto os tipos primitivos:
        byte    => 0;
        short   => 0;
        int     => 0;
        long    => 0L;
        float   => 0.0f;
        double  => 0.0d;
        char    => \u0000;
        boolean => false;
    
    - Tipo primitivo para Wrapper: desde o Java 5 é utilizado a conversão automática (autoboxing);
    - Tipo Wrapper p/ primitivo: desde o Java 5 é utilizado a conversão automática (unboxing);

    - Quando eu preciso trabalhar com listas e coleções o tipo Wrapper é necessário, o tipo Wrapper também traz alguns métodos úteis para manipulações de valores e etc...
        Porém é interessante ressaltar que tipos primitivos podem ser mais seguros com relação a problemas de NullPointerException, pois sempre são inicializados com valores diferentes de nulo (null).

2.
    - A partir do Java 10, quando declaramos uma variável com seu tipo "var", se trata de uma declaração implicita e o compilador é encarregado de definir qual o tipo da variável com base no seu valor inicial. Em contra partida, se definirmos explicitamente o tipo da variável, por exemplo, "Long" estamos deixando explicito que estamos declarando uma variável do tipo Long.

    - Quando declaramos uma variável com o seu tipo implicito, é obrigatório sua inicialização, ao contrário de quando declaramos o tipo explicitamente.

    - Os programas java são organizados em classes, e cada classe faz parte de um pacote, as regras de escopo podem ser cobertas em categorias como:
        - Classe
            - Variáveis declaradas dentro da classe, pode ser acessadas diretamente em qualquer lugar da classe;
        - Locais
            - Variáveis declaradas dentro de um método tem escopo local e não podem ser acessadas por fora;
        - Bloco
            - Variáveis declaradas dentro de um par de chaves "{}" em um método possuem o escopo apenas entre os pares as chaves;

    - Utilizando a palavra "final" significa que aquela variável, não pode ser alterada o valor após sua inicialização, é uma variável imutável;

3. 
    - Podemos criar uma variável do tipo String informando uma cadeia de carácteres ou instanciando um novo objeto do tipo String;
    - Para concatenação de Strings podemos utilizar o sinal de "+" ou podemos utilizar os objetos StringBuilder e StringBuffer;
    - Podemos comparar com outras variáveis do tipo String, podemos obter o seu tamanho (quantidade de caractéres), formatar utilizando outras variáveis do tipo String, e etc...
    - (ver programa StringExamples.java). A diferença entre StringBuilder e StringBuffer é que StringBuilder é mais rápido porém não é thread safe, enquanto o StringBuffer é mais lento e é thread safe.
    - Utilizando os métodos estáticos dos Wrapper ".valueOf(String str)".
    - Utilizando o método ".toString()".