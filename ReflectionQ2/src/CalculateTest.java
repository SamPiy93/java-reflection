import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CalculateTest {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, SecurityException, InvocationTargetException {
		Class<?> clazz = Class.forName("Calculate");
		Object object = clazz.newInstance();
		Field[] fields = clazz.getDeclaredFields();
		for(Field field: fields){
			field.setAccessible(true);
			System.out.println(field.get(object));
		}
		System.out.println("\n\n");
		
		clazz.getMethod("calculate", String.class).invoke(object, "*");
	}

}
