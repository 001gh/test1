

public class AnimalTest2 {
    public static void main(String[] args) {
     //建立对象
    Animal c = new Animal();
    Penguin p = new Penguin();
    Mouse m = new Mouse();
    
    
    //赋予值
    c.setname("猫");
    p.setname("企鹅");
    m.setname("老鼠");

    p.setfood("鱼");
    m.setpland("老鼠洞");

 System.out.println( c.getname());
 c.eat();
 System.out.println(p.getname()+"喜欢吃"+p.getfood());
 System.out.println(m.getname() + "喜欢在"+m.getpland()+"睡觉");   
 p.eat();
 m.eat();
 p.eat();
    }
}
