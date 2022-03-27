package First;

import javax.swing.*;

public class GroundThorn extends Thing{
    public GroundThorn(int x,int y) {
        super(80, 40, x, y, 0);
    }

    @Override
    public void move() {}

    @Override
    public ImageIcon getImage() {
        return Images.sunkens2;
    }
}
