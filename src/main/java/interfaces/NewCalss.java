package interfaces;

public class NewCalss {

    public void test1(){
        TestInterface d = ()->{return "CAr";};
        TestInterface d1 = ()->{return "Animal";};

        test2(d);
        test2(d1);
        test2(()->{return "Rupa";});
    }

    public void test2(TestInterface ti){
        System.out.println(ti.method());
    }


}
