package chapter_eight.innerClass.closureAndCallback.callback1;

//相当于class B  
public class TerroristAttack{  
	//判断是否要执行轰炸
  public void attack(BoomWTC bmw){ 
    if(bmw.benLaDengDecide()){
    	System.out.println("decide  is true   boom!!");
    }  
    else{
    	System.out.println("decide is false");
    }
  }  
} 
