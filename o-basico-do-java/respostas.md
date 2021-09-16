1. A príncipio, pesquisadores da Sun MicroSystems queriam criar uma nova linguagem que permitisse dispositivos eletrônicos se comunicarem com outros, porém, conforme as caracteristicas e conceitos da linguem fora sendo desenvolvidos, mais tarde o foco dos pesquisadores virou-se para a internet. Na época, a diferença da forma que o Java funciona, comparada a outras linguagens, foi revolucionária. Tal popularidade deve-se a forma como o programa é compilado e interpretado pela JVM (Java Virtual Machine): Um mesmo código era transformado em Bytecode no processo de compilação e interpretado/executado pela JVM, sendo assim, único código poderia ser escrito da mesma forma para multiplas plataformas ("write once, run anywhere").

2.  JVM: (Java Virtual Machine) - Máquina virtual Java
        É responsável pela interpretação do bytecode Java que foi compilado. É uma espécie de "tradutor" entre a linguagem, sistema operacional e o hardware. É necessário uma JVM específica para um sistema operacional específico presenta na máquina para execução do programa Java.

    JDK: (Java Development Kit) - Kit de Desenvolvimento Java
        Se trata de um kit para desenvolvedores Java, contém um conjunto de utilitários, bibliotecas e o compilador. É com este kit que nós, desenvolvedores podemos implementar, compilar e executar programas Java. Neste kit também é incluso o JRE.

    JRE: (Java Runtime Environment) -
        É um programa executado no sistema operacional que permite a execução de programas Java, a JVM está presente no software. É necessário pelo menos o JRE para a execução de um programa Java, por exemplo.

3.  - O que você precisou para resolver esta questão:
        - Instalação do JDK na máquina e configuração da variável de       ambiente(opcional);
    - O comando que você usou para compilar:
        - javac HelloWorld.java
    - O comando que você usou para executar:
        - java HelloWorld
    - O que é o método main e qual a sua importância:
        - É o ponto de início de qualquer programa Java;
    - O que é e em que momento da resolução da questão foi gerado o BYTECODE:
        - Bytecode é código compilado pelo compilador presente no JDK. O bytecode foi gerado no momento da compilação "javac HelloWorld.java" resultando em um arquivo "HelloWorld.class";
    
4.  Basicamente o Gargabage Collection é o processo pelo qual um programa Java executa para gerenciamento automatico da memória. Esse processo é responsável pela alocação e liberação de memória. Objetos que possuem referência na execução de um programa Java, são considerados objetos vivos, enquanto os que não possuem qualquer referência em execução, são considerados lixo. O controle do Garbage Collection é feito pela JVM.