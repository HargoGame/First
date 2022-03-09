import java.util.Random;

public class RockPaperScissors extends Thread {

    public RockPaperScissors(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 3; i++){
            try {
                sleep(getTimeSleep());
                System.out.println(getName());
            } catch (InterruptedException e) {

            }
        }
    }
    final Random random = new Random();
    int getTimeSleep(){
        return random.nextInt(300);
    }
}
