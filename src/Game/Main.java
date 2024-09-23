package Game;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static EnemyThread enemyObj;
    public static void main(String[] args) {
        new GameScene();
        enemyObj = new EnemyThread();
        enemyObj.start();


        }
    }
