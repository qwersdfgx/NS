import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Player b;
public Game(String name,String sex,String race){
    b=new Player(name,sex,race);

 }

    public void start() { while (true) {
        Scanner a=new Scanner(System.in);
        System.out.println("输入1 2 3选择怪物类型");
        int i=a.nextInt();
        switch (i){
            case 1:
                System.out.println("与逆天邪魔战斗");
                b.show();
                break;
        }

        System.out.println("gg");
        break;
    }
    }
}




