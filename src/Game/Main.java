package Game;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static EnemyThread enemyObj;
    public static void main(String[] args) {
        /*TestInterf ref1 = (arg1, arg2) -> {
            return arg1 + arg2;
        };
        TestInterf ref2 = (arg1, arg2) ->{
            return arg1 - arg2;
        };
        TestInterf ref3 = (arg1, arg2) ->{
            return arg1 * arg2;
        };


        System.out.println("Lambda is " + ref1.iMeth(1, 2));
        System.out.println("Lambda is " + ref2.iMeth(3, 4));
        System.out.println("Lambda is " + ref3.iMeth(5, 6));*/


        new GameScene();
        enemyObj = new EnemyThread();
        enemyObj.start();

        }
    }
