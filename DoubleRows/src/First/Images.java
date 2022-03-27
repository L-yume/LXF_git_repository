package First;

import javax.swing.*;

public class Images {
    public static ImageIcon Floor;//地板
    public static ImageIcon Brick1;//踩踏方块
    public static ImageIcon Brick2;
    public static ImageIcon Brick3;
    public static ImageIcon Brick4;
    public static ImageIcon Brick5;
    public static ImageIcon Brick6;
    public static ImageIcon Brick7;
    public static ImageIcon Destination;
    public static ImageIcon WaterPipe;
    public static ImageIcon Water;
    public static ImageIcon hedgehog1;
    public static ImageIcon hedgehog2;
    public static ImageIcon sunkens2;
    public static ImageIcon gold;

    static {//初始化图片
        gold = new ImageIcon("imgs/gold.png");
        sunkens2 = new ImageIcon("imgs/sunkens2.png");
        Floor = new ImageIcon("imgs/关卡1.png");
        Brick1 = new ImageIcon("imgs/踩踏方块2.png");
        Brick2 = new ImageIcon("imgs/踩踏方块2.png");
        Brick3 = new ImageIcon("imgs/踩踏方块2.png");
        Brick4 = new ImageIcon("imgs/踩踏方块2.png");
        Brick5 = new ImageIcon("imgs/踩踏方块2.png");
        Brick6 = new ImageIcon("imgs/踩踏方块2.png");
        Brick7 = new ImageIcon("imgs/踩踏方块2.png");
        WaterPipe = new ImageIcon("imgs/水管素材.png");
        Water = new ImageIcon("imgs/水流.png");
        hedgehog1 = new ImageIcon("imgs/刺猬1.png");
        hedgehog2 = new ImageIcon("imgs/刺猬2.png");
    }

    public static void main(String[] args) {//测试是否读取成功
        System.out.println(Floor.getImageLoadStatus());

        System.out.println(Brick1.getImageLoadStatus());
        System.out.println(Brick2.getImageLoadStatus());
        System.out.println(Brick3.getImageLoadStatus());
        System.out.println(Brick4.getImageLoadStatus());
        System.out.println(Brick5.getImageLoadStatus());
        System.out.println(Brick6.getImageLoadStatus());
        System.out.println(Brick7.getImageLoadStatus());
    }
}
