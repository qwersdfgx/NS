public class Pet {
    private String name;
    private  String sex;
public Pet(){}
    public Pet(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void talk(){
        System.out.println("说的道理");
    }
    public void eat(){
        System.out.println("嗨嗨嗨");
    }

}
