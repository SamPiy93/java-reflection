import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAccount {
	public static void main(String[] args){
		try {
			Class<?> clazz = Class.forName("Account");
			Object object = clazz.newInstance();
			Method method = clazz.getMethod("toString", null);
			System.out.println("Account Details: "+method.invoke(object, null));
			
			Field field = clazz.getDeclaredField("accountId");
			field.setAccessible(true);
			field.set(object, "2233-4512-3214");
			field = clazz.getDeclaredField("amount");
			field.setAccessible(true);
			field.set(object, 1250000.00);
			
			System.out.println("Modified Account Details: "+method.invoke(object, null));
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (SecurityException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
