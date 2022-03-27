package First;

import First.Images;
import First.Thing;

import javax.swing.*;

public class Water extends Thing {
    public Water(){
        super(440,80,1120,640,3);
    }
    public void move(){
        x-=speed;
    }
    public ImageIcon getImage() {
        return Images.Water;
    }
}
