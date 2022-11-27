import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner s = new Scanner(System.in);
        System.out.println("输入角色姓名");
        String name = s.next();
        System.out.println("输入角色性别");
        String sex = s.next();
        System.out.println("输入角色种族");
        String race = s.next();
        Player f = new Player();
        f.setName(name);
        f.setSex(sex);
        f.setRace(race);

        System.out.println("创建成功");
        System.out.println("是否开始游戏？[Y][N]");
        String c = s.next();
        Game g=new Game(name,sex,race);
        if (c.equals("Y") || c.equals("y")) {
            System.out.println(" 按任意键开启新手大礼包");
            String a=s.next();
            Random r=new Random();
            int i1 = r.nextInt(3);
            switch (i1){
                case 0:
                    System.out.println("恭喜你，没有获得武器");
                    f.setWuqi("空手");
                    break;
                case 1:
                    System.out.println("恭喜你，获得了剑");
                    f.setWuqi("剑");
                    break;
                case 2:
                    System.out.println("恭喜你，获得了铳");
                    f.setWuqi("铳");
                    break;
                case 3:
                    System.out.println("恭喜你，获得了斧");
                    f.setWuqi("斧");
                    break;
            }

            g.start();

        } else {
            System.out.println("结束");

        }
    }}