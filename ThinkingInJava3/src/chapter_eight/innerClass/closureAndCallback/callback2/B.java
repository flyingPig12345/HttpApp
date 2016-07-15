package chapter_eight.innerClass.closureAndCallback.callback2;

public class B{  
    public void execute(CallBack action){  
           getConnection();    
           action.doCRUD(); 
           releaseConnection();    
       }    
 
     public void getConnection(){    
           System.out.println("获得连接...");    
       }    
           
       public void releaseConnection(){    
           System.out.println("释放连接...");    
       }    
}  
