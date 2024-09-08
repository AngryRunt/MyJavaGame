import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameScene extends JFrame
{
    GameScene(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100, 100, 800, 600);
    this.setLayout(null);
    this.setTitle("MegaGame");
    this.setVisible(true);

    ImageIcon icHero = new ImageIcon("hero.jpg");
    jlHero = new JLabel(icHero);
    this.add(jlHero);
    jlHero.setBounds(200, 400, 100, 30);

    ImageIcon icEnemy = new ImageIcon("enemy.png");
    jlEnemy = new JLabel(icEnemy);
    this.add(jlEnemy);
    jlEnemy.setBounds(500, 400, 80, 85);




    this.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 87 ->{

                    if ((jlHero.getY() - 5) > 0){
                        jlHero.setLocation(jlHero.getX(), jlHero.getY() - 5);}
                }
                case 65 ->{
                    if ((jlHero.getX() - 5) > 0){
                        jlHero.setLocation(jlHero.getX() - 5, jlHero.getY());
                    }

                }
                case 83 ->{
                    if ((jlHero.getY() + 5) < (GameScene.this.getHeight() - jlHero.getHeight() * 2)){
                        jlHero.setLocation(jlHero.getX(), jlHero.getY() + 5);
                    }

                }
                case 68 ->{
                    if((jlHero.getX() + 5) < (GameScene.this.getWidth() - jlHero.getWidth())){
                        jlHero.setLocation(jlHero.getX() + 5, jlHero.getY());
                    }


                }
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        });
    }
    static JLabel jlHero, jlEnemy;
}