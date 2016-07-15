package chapter_four;
class Father {
     String name="父类属性";
     static String name2 = "父类静态属性";
    {
        System.out.println(name);
        System.out.println("父类块");
    }
    static{
        System.out.println(name2);
        System.out.println("父类静态块");
    }
    
    public Father() {
        System.out.println("父类构造器");
    }
}



public class Son extends Father{
    private String sonName = "子类属性";
    private static String sonStaticName = "子类静态属性";
    
    {
        System.out.println(sonName);
        System.out.println("子类块");
    }
    
    static {
        System.out.println(sonStaticName);
        System.out.println("子类静态块");
    }
    public Son(){
        System.out.println("子类构造器");
    }
    public static void main(String[] args) {
        System.out.println("----------------------");
        new Son();
        System.out.println("----------------------");
    }
}