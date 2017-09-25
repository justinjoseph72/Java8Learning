package interfaces;

public interface TestInterface {

    default void default_method(){
        System.out.println(static_method());
        System.out.println("This is interface default method");
    }

    static String static_method(){
        return "Interface static method";
    }
}
