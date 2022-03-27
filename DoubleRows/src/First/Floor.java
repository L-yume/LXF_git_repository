package First;

import First.Images;
import First.Thing;

import javax.swing.*;

public class Floor extends Thing {
    public Floor() {
        super(4960,800,0,0,3);
    }

    public void move(){
    x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Floor; //返回地板图片}
    }
}

