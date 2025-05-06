package Exercise2;

public class GenericMethods {
    @SafeVarargs
    public static <Type> void printArguments(Type... args) {
        for (Type arg : args) {
            System.out.println(arg);
        }
    }
}