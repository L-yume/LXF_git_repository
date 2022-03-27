package First;

import javax.swing.*;

public class Brick5 extends Thing {
    public Brick5(){
        super(80,30,3680,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick5;
    }
}
