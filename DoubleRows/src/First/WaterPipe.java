package First;

import First.Images;
import First.Thing;

import javax.swing.*;

public class WaterPipe extends Thing {
    public WaterPipe() {
        super(40, 80, 1560, 640, 3);
    }
        public void move() {
            x -= speed;
        }//测试用
        public ImageIcon getImage() {
            return Images.WaterPipe;
        }
    }

