package Game;

public class EnemyThread extends Thread  implements Interf01 {
    @Override
    public void run() {
        while (true) {
            int iRandomDirectionX = (int)(Math.random()*3)-1;
            int iRandomDirectionY = (int)(Math.random()*3)-1;
            int iStepsCount = (int)(Math.random()*10)+10;
            for (int i = 0; i < iStepsCount; i++) {
                if (GameScene.jlEnemy.getX() - 3 * iRandomDirectionX < 2 || GameScene.jlEnemy.getX() - 3 * iRandomDirectionX > WINDOW_WIDTH) iRandomDirectionX *= -1;
                if (GameScene.jlEnemy.getY() - 3 * iRandomDirectionY < 2 || GameScene.jlEnemy.getY() - 3 * iRandomDirectionY > WINDOW_HEIGHT) iRandomDirectionY *= -1;
                GameScene.jlEnemy.setLocation(GameScene.jlEnemy.getX() - 3 * iRandomDirectionX, GameScene.jlEnemy.getY() - 3 * iRandomDirectionY);
                if ((Math.abs(GameScene.jlHero.getX() - GameScene.jlEnemy.getX()) < 10) && ((Math.abs(GameScene.jlHero.getY() - GameScene.jlEnemy.getY()) < 10))) {
                    Main.enemyObj.interrupt();
                    System.out.println("Caught!");
                    return;
                }



                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }






        }


    }
}
