package First;

import javax.swing.*;

public class Gold extends Thing{
    public Gold(int x, int y) {
        super(50, 50, x, y, 0);
    }

    @Override
    public void move() {}

    @Override
    public ImageIcon getImage() {
        return Images.gold;
    }
}
