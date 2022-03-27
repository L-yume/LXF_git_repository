package First;

import javax.swing.*;

public class Brick6 extends Thing {
    public Brick6(){
        super(80,30,3780,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick6;
    }
}
