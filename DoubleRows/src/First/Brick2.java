package First;

import javax.swing.*;

public class Brick2 extends Thing {

    public Brick2(){
        super(80,30,3360,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick2;
    }
}
