public class EncapsulationExample {

    public static void main(String[] args) {

        // Utilizando o método
        EncapsulationExample.showMessage();

        EncapsulationExample.showMessage("Mensagem exemplo");

        // Exibindo a mensagem do atributo estático
        System.out.println(EncapsulationExample.DEFAULT_MESSAGE);

        long result = EncapsulationExample.sum(45, 10);

        System.out.println("Retorno método \"sum\": " + result);

        // Utilizando o construtor padrão
        EncapsulationExample encapsulationExample1 = new EncapsulationExample();

        // Utilizando o construtor com parâmetro
        EncapsulationExample encapsulationExample2 = new EncapsulationExample("Cristian");

        EncapsulationExample encapsulationExample3 = new EncapsulationExample("Cristian", "Berti");

        // Exibindo o nome completo
        System.out.println(encapsulationExample3.getFullName());

        // Alterando o primeiro nome
        encapsulationExample3.setFirstName("José");

        // Exibindo o primeiro nome
        System.out.println(encapsulationExample3.getFirstName());

        // Exibindo o nome completo alterado
        System.out.println(encapsulationExample3.getFullName());
    }

    // Atributo estático, o mesmo pode ser acessado sem a instanciação do objeto. Todos objetos instâncias terão o mesmo valor para os campos estáticos
    public static final String DEFAULT_MESSAGE = "Mensagem padrão!";
    private String firstName;
    private String lastName;

    // Construtor padrão
    public EncapsulationExample() {
    }

    // Construtor com argumentos
    public EncapsulationExample(String firstName) {
        this.firstName = firstName;
    }

    // Sobrecarga de construtores
    public EncapsulationExample(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    // Método com argumentos e valores de retorno, métodos estáticos não necessitam da instanciação do objeto para serem utilizados,
    // porém dentro deles só poderão ser utilizados atributos estáticos
    private static long sum(long a, long b) {
        return a + b;
    }

    // Método sem argumentos e valores de retorno
    private static void showMessage() {
        System.out.println(DEFAULT_MESSAGE);
    }

    // Sobrecarga de métodos
    private static void showMessage(String message) {
        if (message == null || message.isBlank()) {
            showMessage();
        }
        System.out.println(message);
    }

    // Getter's e Setter's
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return String.format("%s %s", firstName.trim(), lastName.trim());
    }
}
