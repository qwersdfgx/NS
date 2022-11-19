public class Cat extends Pet {
    private String color;

    public Cat(String name, String sex, String color) {
        super(name, sex);
        this.color = color;
    }

    public Cat() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void talk(){
        System.out.println("mio");
    }
    public void eat(){
        System.out.println("gg");
    }
}
