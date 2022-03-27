package First;

import javax.swing.*;

public class Brick4 extends Thing {

    public Brick4(){
        super(80,30,3600,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick4;
    }
}
