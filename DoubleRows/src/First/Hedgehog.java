package First;

import javax.swing.*;

public class Hedgehog extends Thing{

    public Hedgehog(int x,int y) {
        super(11, 11, x, y,2);
    }

    @Override
    public void move() {}

    public void moveLeft(){
        x -= speed;
    }

    public void moveRight(){
        x += speed;
    }


    @Override
    public ImageIcon getImage() {
        int[] bd = {1760,2160,4160};
        int i = 0;
        if (this.x>bd[i++]){
            return Images.hedgehog1;
        }else{
            return Images.hedgehog2;
        }
    }
}
