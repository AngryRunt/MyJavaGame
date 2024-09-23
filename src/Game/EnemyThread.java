package Game;

public class EnemyThread extends Thread {
    @Override
    public void run() {
        while (true) {

            //System.out.println((int)(Math.random()*8));
            GameScene.jlEnemy.setLocation(GameScene.jlEnemy.getX(), GameScene.jlEnemy.getY() - 3);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            if (((GameScene.jlHero.getX() - GameScene.jlEnemy.getX() < 3)) && ((GameScene.jlHero.getY() - GameScene.jlEnemy.getY() < 3))) {
                Main.enemyObj.interrupt();
                System.out.println("Caught!");
                return;
            }



        }


    }
}
