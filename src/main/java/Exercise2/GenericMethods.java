package Exercise2;

public class GenericMethods {
    @SafeVarargs
    public static <T> void printArguments(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }

    public static <T> void printArgumentsUnsafe(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}