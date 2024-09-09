package Game;

public class EnemyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if ((GameScene.jlEnemy.getY() - 3) > 0) {
                GameScene.jlEnemy.setLocation(GameScene.jlEnemy.getX(), GameScene.jlEnemy.getY() - 3);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
