package dongtaidaili;



public class ConcreteClass implements TargetInterface{  
	  
	//被调用的接口
    public int targetMethodA(int number) {  
        System.out.println("操作-打印数字:"+number);  
        return number;  
    }  
      
} 