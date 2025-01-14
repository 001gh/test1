public class AnimalTest {
    public static void main(String[] args) {
        //建立猫动物的对象
        Animal a = new Animal();

        //猫动物赋予值
        a.setname("猫");
        a.setid (1);

        //获取Animal中的值
        System.out.println(a.getname());
        System.out.println(a.getid());

        //调用Animal中的行为
        a.eat();
        a.sleep();
        a.introduction();

        //建立狗动物的对象
        Animal b = new Animal();

        //狗动物赋予值
        b.setname("狗");
        b.setid(2);

        //获取Animal中的值
        System.out.println(b.getname());
        System.out.println(b.getid());

        //调用Animal中的行为
        b.eat();
        b.sleep();
        b.introduction();

    }
}
