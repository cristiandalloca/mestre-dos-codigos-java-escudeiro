public class StringExamples {
    public static void main(String[] args) {
        
        // Declarando String's
        String name = "Cristian";
        System.out.println("name: " + name);

        String lastName = new String("Berti");
        System.out.println("lastName: " + lastName);

        // Concatenando String's
        String fullName = name + " " + lastName;
        System.out.println("fullName: " + fullName);

        // Utilizando o StringBuilder
        System.out.println("Utilizando StringBuilder: ");
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append("Cristian");
        nameBuilder.append(" ");
        nameBuilder.append("Berti");

        System.out.println(nameBuilder.toString());

        // Utilizando o StringBuffer
        StringBuffer nameBuffer = new StringBuffer();
        nameBuffer.append("Cristian");
        nameBuffer.append(" ");
        nameBuffer.append("Berti");

        System.out.println("Utilizando StringBuffer: ");
        System.out.println(nameBuffer.toString());
    }
}
