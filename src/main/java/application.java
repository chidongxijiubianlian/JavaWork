import com.mypackage.beanannotation.TestBeanannotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {
    public static void main(String[] args)
    {
        //autowired默认按照类型装配 配合Qualifier注解可以按照名称装配 执行的比较晚 属于springframework
        //resource默认按照名称装配 若名称没值按照类型装配 执行比较早 属于j2ee
        ApplicationContext factory = new ClassPathXmlApplicationContext("BeanXMLA.xml");
        TestBeanannotation testBeanannotation =(TestBeanannotation)factory.getBean("TestBeanannotation");
        testBeanannotation.show();
    }
}
