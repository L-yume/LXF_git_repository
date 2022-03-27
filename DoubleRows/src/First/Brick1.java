package First;

import javax.swing.*;

public class Brick1 extends Thing implements PersonTouch {

    int time = 3;//延迟时间，可修改
    public Brick1() {
       super(80,30,3360,640,3);
    }
    public void move(){
        x-=speed;
    }//测试用
    public ImageIcon getImage() {
        return Images.Brick1;
    }

    public void Step(){//延迟消失,时间减到0则笑死
        time--;
        if(time==0){
            goDead();
        }
    }
    /*
    public int getTime(){//返回时间
        return time;
    }
     */
    @Override
    public boolean IsManTouch() {
        return false;
    }
}
