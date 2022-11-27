import java.util.Random;

public class Player{
    private String name;
    private String wuqi;
    private  String race;
    private  String sex;
    private int xue;
    private int attack;
    private int defend;
    private int level;
    private int maxxue;
    private  int exp;
    private boolean isLive;
    private int money;





    public Player(String name,String race,String sex) {
        this.name = name;
        this.wuqi = wuqi;
        this.race = race;
        this.sex = sex;
        xue=100;
        attack=50;
        defend=100;
        level=0;
        maxxue=100;
        exp=0;
        money=0;


    }

    public Player() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWuqi() {
        return wuqi;
    }

    public void setWuqi(String wuqi) {
        this.wuqi = wuqi;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getXue() {
        return xue;
    }

    public void setXue(int xue) {
        this.xue = xue;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxxue() {
        return maxxue;
    }

    public void setMaxxue(int maxxue) {
        this.maxxue = maxxue;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
    public void dead() {
        System.out.println("[-]" + name + "你挂了");
        isLive = false;

    }

    public void show() {
        System.out.println(name + "生命值是：" + xue+ "\n攻击力" + attack + "防御力：" + defend);
    }

    public void addLevel() {
        attack += 2;
        defend += 2;
        level++;
        maxxue++;
        xue = maxxue;
        System.out.println("[-]" + "升级成功！当前的等级是：" + level);
        show();
    }


    public void addMoney(int money) {
        Random r=new Random();
        int i1 = r.nextInt(10);
        money+= i1;

        if(money>100) {
            addLevel();
        money=0;
        }


}}
