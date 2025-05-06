package Exercise1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alvaro", "Mendoza", 30);
        String message = "Hello";
        boolean student = true;
        float stature = 1.80F;

        GenericMethods.printArguments(person, message, student, stature);
    }
}