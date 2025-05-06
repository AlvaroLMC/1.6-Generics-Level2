package Exercise2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alvaro", "Mendoza", 30);
        String message = "Hello";
        boolean student = true;

        GenericMethods.printArguments(person, message, student, 1.80F);
    }
}