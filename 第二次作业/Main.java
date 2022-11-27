import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pet rz = new Pet();
        Cat m = new Cat();
        Dog n = new Dog();
        rz.setName("otto");
        rz.setSex("guonan");
        rz.talk();
        rz.eat();
        System.out.println(rz.getSex()+" is "+rz.getName());
        System.out.println("--------");
        m.setColor("white");
        m.setName("M");
        m.setSex("nv");
        m.talk();
        m.eat();
        System.out.println(m.getSex());
        System.out.println(m.getName());
        System.out.println(m.getColor());
        System.out.println("--------");
        n.setSex("nan");
        n.setWeight(66);
        n.setName("N");
        n.talk();
        n.eat();
        System.out.println(n.getSex());
        System.out.println(n.getName());
        System.out.println(n.getWeight());
    }
}