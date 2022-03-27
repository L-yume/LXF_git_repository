package First;

import javax.swing.*;
import java.awt.*;

public abstract class Thing {
    public static final int LIVE = 0; //活的
    public static final int DEAD = 1; //死的
    protected int state = LIVE; //当前状态(默认为活着的)
    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;//速度。测试窗口用


    public Thing(int width,int height,int x,int y,int speed){//可破坏砖块宽高固定，x不固定
        this.width = width;
        this.height = height;
        this.x=x;
        this.y = y;
        this.speed = speed;
    }

    /*
    判断砖块死活
     */
    public boolean isLive() {
        return state == LIVE; //若LIVE，则true，否则返回false
    }
    public boolean isDead(){//若DEAD，true
        return state == DEAD;
    }
    public void goDead() {
        state = DEAD; //将对象状态DEAD，踩踏方块消失
    }



    public abstract ImageIcon getImage();
    public abstract void move();//测试窗口移动
    public void paintImage(Graphics g) {
        if (this.isLive()) { //若活着的
            this.getImage().paintIcon(null, g, this.x, this.y);
        }
    }
}
