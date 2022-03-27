package First;

import javax.swing.*;

public class Brick7 extends Thing {
    public Brick7(){
        super(80,30,3840,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick7;
    }
}
