package First;

import javax.swing.*;

public class Brick3 extends Thing {

    public Brick3(){
        super(80,30,3520,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick3;
    }
}
