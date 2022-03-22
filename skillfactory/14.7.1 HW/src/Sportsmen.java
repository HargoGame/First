public class Sportsmen extends Thread {

    public static int number;

    @Override
    public void run(){
        for (int i = 0; i < 2000; i++){
            incNumber();
        }
    }

    public static synchronized void incNumber(){
        number++;
    }
}
