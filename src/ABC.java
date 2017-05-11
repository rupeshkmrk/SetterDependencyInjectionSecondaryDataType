import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ABC {

	public static void main(String[] args) {
		String files[] = new String[]{"car.xml","engine.xml"};
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
		Car car = (Car) applicationContext.getBean("c");
		car.printCarData();
//		applicationContext.getBean("c");
		
	}
}
