package First;

import javax.swing.*;

public class Map extends Thing{
    public Map() {
        super(4960, 800, 0, 0, 3);
    }

    @Override
    public void move() {
        x -= speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.Floor;
    }
}
