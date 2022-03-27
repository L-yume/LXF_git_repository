package First;

import First.Images;
import First.PersonTouch;
import First.Thing;

import javax.swing.*;
//终点
public class Destination extends Thing implements PersonTouch {
    public Destination(){
        super(160,160,4880,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用

    public ImageIcon getImage() {
        return Images.Destination;
    }

    @Override
    public boolean IsManTouch() {//人物碰到地图切换
        return true;
    }
}
