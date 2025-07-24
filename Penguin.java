<<<<<<< HEAD
public class Penguin extends Animal {
    private String food;
    //set和get方法
     //set方法：给成员变量赋值
     //get方法：对外提供成员变量的值
     public void setfood(String myfood) { 
        food = myfood; 
    } 
    public String getfood(){
        return food;
    }
    
    public void eat(){
        super.eat();
        System.err.println("正在吃");
    }
}
=======
public class Penguin extends Animal {
    private String food;
    //set和get方法
     //set方法：给成员变量赋值
     //get方法：对外提供成员变量的值
     public void setfood(String myfood) { 
        food = myfood; 
    } 
    public String getfood(){
        return food;
    }
    
    public void eat(){
        super.eat();
        System.err.println("正在吃");
    }
}
>>>>>>> 54d5b9516b1d6a1e10cb7d3cc9a9626087fe8a05
