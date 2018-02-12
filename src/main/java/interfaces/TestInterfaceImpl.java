package interfaces;

public class TestInterfaceImpl implements  TestInterface{

    @Override
    public String method() {
        return null;
    }

    public static String static_method(){
        return "Impl static method";
    }

//    @Override
//    public void default_method(){
//        System.out.println("default method of impl");
//    }


}
