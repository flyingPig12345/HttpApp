package chapter_eight.innerClass.parcel9;

public class Test {  
    public Destination destination(   final String dest, final float price){  
        return new Destination() {  
            private int cost;  
            private String label = dest;  
            {//实例初始化代码块,相当于构造器的实际效果  
                cost = Math.round(price);  
                if (cost > 100)  
                    System.out.println("Over budget!");  
            }  
            public String readLabel() {  
                return label;  
            }  
        };  
    }  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        Test p = new Test();  
        Destination d = p.destination ("Tasmania",101.34F);  
  
    }  
  
}  
