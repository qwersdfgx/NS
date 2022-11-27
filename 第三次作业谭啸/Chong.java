public class Chong extends Zhuangbei {
    private int naijiu;

    public  void zhongji(){
        System.out.println("急急急");
    }
    public  void qingji(){
        System.out.println("火力全开");
    }
    public void mosui(){
        naijiu=naijiu-5;
    }

    public String sunhuai(int naijiu) {
        if(naijiu<30)
            return "武器破坏";
        return "耐久下降了";
    }

    public Chong(int naijiu) {
        this.naijiu = naijiu;
    }

    public int getNaijiu() {
        return naijiu;
    }

    public void setNaijiu(int naijiu) {
        this.naijiu = naijiu;
    }
}

