package generics;

public class GenericInContructor<X> {

    public GenericInContructor(){
        System.out.println("default constructor");
    }

    public <T> GenericInContructor(T a){
        System.out.println("generic constructor");

    }


    X b;
}
