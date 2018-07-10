import com.mypackage.beanannotation.TestBeanannotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {
    public static void main(String[] args)
    {
        ApplicationContext factory = new ClassPathXmlApplicationContext("BeanXMLA.xml");
        TestBeanannotation testBeanannotation =(TestBeanannotation)factory.getBean("TestBeanannotation");
        testBeanannotation.show();
    }
}
