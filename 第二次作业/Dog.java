public class Dog extends Pet {
   private int weight;

    public Dog(String name, String sex, int weight) {
        super(name, sex);
        this.weight = weight;
    }

    public Dog() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void talk(){
        System.out.println("你也送送她吧");
    }
    public void eat(){
        System.out.println("あああああああああ！");
    }
}
