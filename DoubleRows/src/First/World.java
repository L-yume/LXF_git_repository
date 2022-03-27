package First;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

/*
第一关横向共62个方块，踩踏方块共7块，43-49
第二关横向共43个方块
 */
public class World extends JPanel {
    public static final int WIDTH = 1200;//窗口宽
    public static final int HEIGHT = 800;//窗口高
    public static final int RUNNING = 0;//运行状态
    public static final int GAME_OVER = 1;//游戏结束状态
    private int state = RUNNING;//窗口当前状态
    private Floor[] floor = {};//地图
    private int score = 0;//分数

    private Map map = new Map();
    private Gold[] gold1 = {};
    //private Gold[] gold2 = {};
    private GroundThorn[] gt = {new GroundThorn(4560,600),
                                new GroundThorn(4720,600)};

    private Water[] water = {};
    private WaterPipe[] waterpipe = {};
    private Hedgehog[] hedgehogs = {new Hedgehog(2010, 600),
                                    new Hedgehog(2470, 600),
                                    new Hedgehog(4470, 600)};
    // Font f = new Font("微软雅黑",Font.PLAIN,14);

    public void paint(Graphics g) {//导入地图方块
        Images.Floor.paintIcon(null, g, map.x, 0);//完整地图
        Images.Brick1.paintIcon(null, g, 3360, 640);
        Images.Brick2.paintIcon(null, g, 3440, 640);
        Images.Brick3.paintIcon(null, g, 3520, 640);
        Images.Brick4.paintIcon(null, g, 3600, 640);
        Images.Brick5.paintIcon(null, g, 3680, 640);
        Images.Brick6.paintIcon(null, g, 3760, 640);
        Images.Brick7.paintIcon(null, g, 3840, 640);
        Images.WaterPipe.paintIcon(null, g, 1560, 640);
        Images.Water.paintIcon(null, g, 1120, 640);
        g.drawString("SCORE: " + score, 50, 50);

        for (int i = 0; i < hedgehogs.length; i++) {
            hedgehogs[i].paintImage(g);
        }
        for (int i = 0; i < gt.length; i++) {
            gt[i].paintImage(g);
        }
        for (int j = 0; j < gold1.length; j+=2) {
            gold1[j].paintImage(g);
        }
        for (int k = 1; k < gold1.length; k+=2) {
            gold1[k].paintImage(g);
        }
        if (index%2==0 && flag < 815){
            flag += 80;
        }
        if (index>=1 && index%2==1 && flag2 < 3855){
            flag2 += 80;
        }
        index++;
        /*
        g.setColor(Color.black);
        g.fillRect(0,0,160,160);//终点,测试用，实际坐标4720,480,
         */
    }

    private int index = 0;
    private int i = 0;
    private int flag = 415;
    private int flag2 = 3375;
    public Gold nextOne(){
        if (index%2==0){
            return new Gold(flag,590);
        }else{
            return new Gold(flag2,590);
        }
    }

    public void goldEnterAction(){
        Gold obj = nextOne();
        gold1 = Arrays.copyOf(gold1,gold1.length+1);
        gold1[gold1.length-1] = obj;
        //index++;
    }

    public void moveAction() {
        int[] boundary = {1760,2160,4160};
        //map.move();
        for (int j = 0; j < hedgehogs.length; j++) {
            if (hedgehogs[j].x>boundary[j]){
                hedgehogs[j].moveLeft();
            }else{
                hedgehogs[j].moveRight();
            }
        }
    }

    public void action() {
        Timer timer = new Timer();
        int interval = 10;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (map.x>=-3840){
                    moveAction();
                    goldEnterAction();
                }
                repaint();
            }
        }, interval, interval);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("第一关");
        World world = new World();//初始化地图
        frame.setFocusable(true);
        frame.add(world);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口退出格式，点击关闭
        frame.setSize(WIDTH, HEIGHT + 44);//界面大小
        //frame.setBackground(Color.WHITE);//背景颜色

        frame.setLocationRelativeTo(null);//窗口居中显示
        //frame.setResizable(false);//锁定窗口
        frame.setVisible(true);//窗口可见
        world.action();
    }
}
