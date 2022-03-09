public class Main {

    public static void main(String[] args) {

        RockPaperScissors rock = new RockPaperScissors("Камень!");
        RockPaperScissors scissors = new RockPaperScissors("Ножницы!");
        RockPaperScissors paper = new RockPaperScissors("Бумага!");

        System.out.println("Игра началась!");

        rock.start();
        scissors.start();
        paper.start();

        while (rock.isAlive() || scissors.isAlive() || paper.isAlive()) {
            try {
                Thread.sleep(100);
                System.out.println("Камень!");
            } catch (InterruptedException e) {
            }
        }

        if (paper.isAlive()){
            try {
                paper.interrupt();
                paper.join();
            } catch (InterruptedException e){
            }
            System.out.println("Бумага!");
        } else {
            try {
                scissors.interrupt();
                scissors.join();
            } catch (InterruptedException e){
            }
            System.out.println("Ножницы!");
        }

        System.out.println("Игра закончилась!");

    }
}
