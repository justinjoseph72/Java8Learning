package interfaces;

public interface TestInterface {

    default void default_method(){

        System.out.println(static_method());
        System.out.println("This is interface default method");
    }

    String method();


    default void default_method1(){
        System.out.println(static_method());
        System.out.println("This is interface default method");
    }

    static String static_method(){
        return "Interface static method";
    }
    static String static_method1(){
        return "Interface static method";
    }

}
