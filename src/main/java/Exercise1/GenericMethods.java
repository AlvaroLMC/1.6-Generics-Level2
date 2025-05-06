package Exercise1;



public class GenericMethods {
    public static <Type1, Type2, Type3> void printArguments(Type1 argument1, Type2 argument2, Type3 argument3, float argument4) {
        System.out.println(argument1);
        System.out.println(argument2);
        System.out.println(argument3);
        System.out.println(argument4);
    }
}
