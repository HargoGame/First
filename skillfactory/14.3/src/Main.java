public class Main {

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker(); // строка 1
        Thread t1 = worker.new Process();
        Thread t2 = worker.new Process();


        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long finish = System.currentTimeMillis();

        System.out.println("list 1 size is: " + worker.list1.size());
        System.out.println("list 2 size is: " + worker.list2.size());
        // замеряем время выполнения
        System.out.println("Time taken: " + (finish - start) + " ms");	}
}
