package flappyBird;

import javax.swing.JFrame;

public class FlappyBird{
  public static FlappyBird flappyBird;

  public final int WIDTH = 800, HEIGHT = 800;

  public FlappyBird(){
    JFrame jframe = new JFrame();

    jframe.setSize(WIDTH, HEIGHT);
    jframe.setVisible(true);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args){
    flappyBird = new FlappyBird();
  }

}