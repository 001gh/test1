<<<<<<< HEAD
public class Animal {
    //动物的属性
     private  String name;
     private  int id;
     //set和get方法
     //set方法：给成员变量赋值
     //get方法：对外提供成员变量的值
     public void setname(String myName) { 
        name = myName; 
    } 

    public String getname(){
        return name;
    }

    public void setid(int myid){
        id = myid;
    }

    public int getid(){
        return id;
    }
    
    //动物的行为
    public void eat(){
        System.err.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
    public void introduction(){
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}
=======
public class Animal {
    //动物的属性
     private  String name;
     private  int id;
     //set和get方法
     //set方法：给成员变量赋值
     //get方法：对外提供成员变量的值
     public void setname(String myName) { 
        name = myName; 
    } 

    public String getname(){
        return name;
    }

    public void setid(int myid){
        id = myid;
    }

    public int getid(){
        return id;
    }
    
    //动物的行为
    public void eat(){
        System.err.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
    public void introduction(){
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}
>>>>>>> 54d5b9516b1d6a1e10cb7d3cc9a9626087fe8a05
