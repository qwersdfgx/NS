public class Fu {
    private int naijiu;

    public  void zhongji(){
        System.out.println("巨斧砍大树");
    }
    public  void qingji(){
        System.out.println("龙卷风摧毁停车场");
    }
    public void mosui(){
        naijiu=naijiu-3;
    }

    public String sunhuai(int naijiu) {
        if(naijiu<18)
            return "武器破坏";
        return "耐久下降了";
    }

    public Fu(int naijiu) {
        this.naijiu = naijiu;
    }

    public int getNaijiu() {
        return naijiu;
    }

    public void setNaijiu(int naijiu) {
        this.naijiu = naijiu;
    }
}
