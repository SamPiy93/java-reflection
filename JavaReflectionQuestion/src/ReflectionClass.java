import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionClass {
	public static void main(String[] args){
		String subClass = args[0];
//		String subClass = "ClassC";
		try {
			List<Class> clazzList = new ArrayList<>();
			List<Class> clazzes = rec(Class.forName(subClass), clazzList); 
			
			for(Class c : clazzes){
				Method[] m = c.getDeclaredMethods();
				for(Method method : m){
					if(method.getReturnType().getName() != "ClassC"){
						for(Class<?> p : method.getParameterTypes()){
							if(p.getName() == "ClassC"){
								System.out.println(c.getName()+"."+method.getName());
								break;
							}
						}
					}else{
						System.out.println(c.getName()+"."+method.getName());
					} 
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static List<Class> rec(Class clazz, List<Class> classArray){
		if(clazz.getSuperclass() == null){
			return classArray;
		}else{
			classArray.add(clazz);
			return rec(clazz.getSuperclass(), classArray);
		}
	}
}
