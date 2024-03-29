package chapter_ten.instacneof;

import java.util.Arrays;

/**
 * 关联型数组   associative array
 * map 仿写
 * @author Administrator
 *
 */
public class Test {
	private Object[][] pairs;
	private int index;
	//constructor
	Test(int length){
		pairs = new Object[length][2];
	}
	
	//创建简单的Map模型
	public void put(Object key,Object value){
		if(index >= pairs.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++] = new Object[]{ key,value};
//		System.out.println(Arrays.deepToString(pairs));
	}
	
	//map 模型，获取
	public Object get(Object key){
		for(int i = 0;i<index;i++)
			if(key.equals(pairs[i][0]))
				return pairs[i][1];
			throw new RuntimeException("Failed to find key");
	}
	public String toString(){
		String result = "";
		for(int i = 0;i<index;i++){
			result += pairs[i][0]+" : " +pairs[i][1];
			if(i<index -1)
				result += "\n";
		}
		return result;
	}
	
	public static void main(String args[]){
		Test map = new Test(6);
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		try {
			map.put("extra", "object");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Too many objects");
		}
		System.out.println(map);
		System.out.println(map.get("ocean"));
	}
	
}
