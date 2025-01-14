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
