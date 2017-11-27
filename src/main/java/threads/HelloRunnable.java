package threads;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from thread");
        String[] strings = new String[]{"one","two","three","four"};
        for(String str: strings){
            System.out.println(str);
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();

    }
}
