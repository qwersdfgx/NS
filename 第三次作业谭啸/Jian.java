public class  Jian extends Zhuangbei {
    private int naijiu;

    public  void zhongji(){
        System.out.println("咸鱼突刺");
    }
    public  void qingji(){
        System.out.println("闪电旋风劈");
    }
    public void mosui(){
        naijiu=naijiu-1;
    }

    public String sunhuai(int naijiu) {
        if(naijiu<10)
            return "武器破坏";
        return "耐久下降了";
    }

    public Jian(int naijiu) {
        this.naijiu = naijiu;
    }

    public int getNaijiu() {
        return naijiu;
    }

    public void setNaijiu(int naijiu) {
        this.naijiu = naijiu;
    }
}
