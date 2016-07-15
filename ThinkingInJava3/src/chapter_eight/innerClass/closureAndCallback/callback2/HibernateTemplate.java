package chapter_eight.innerClass.closureAndCallback.callback2;

//模拟Spring中HibernateTemplate回调机制的代码  
interface CallBack{     
    public void doCRUD();     
}    
    
public class HibernateTemplate {     
        
	//执行方法
    public void execute(CallBack action){    
        getConnection();    
        action.doCRUD();    
        releaseConnection();    
    }    
     //添加
    public void add(){    
         execute(new CallBack(){    
            public void doCRUD(){    
                System.out.println("执行add操作...");    
            }    
         });    
    }     
    
    public void getConnection(){    
        System.out.println("获得连接...");    
    }    
        
    public void releaseConnection(){    
        System.out.println("释放连接...");    
    }    
        
}  
