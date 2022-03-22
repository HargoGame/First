public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Sportsmen());
        Thread t2 = new Thread(new Sportsmen());
        Thread t3 = new Thread(new Sportsmen());

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Sportsmen.number);


    }
}
