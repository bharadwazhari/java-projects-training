import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


/**
 * This class provides functionality to initialize the Spring application context.
 * @author Bharadwaz Hari
 */
@Configuration
@ImportResource("classpath:ApplicationContext.xml")
public class SpringApplicationContext {
	// Initialize the Spring context for this class.
    private static ApplicationContext c_context = null;
    
    /**
     * Synchronized method to initialize the Spring application context.
     * Method must be synchronized to provide thread-safety within the application
     * as asynchronous calls could be made to method getContext() when <code>c_context</code>
     * is null.
     */
    public static synchronized void initializeContext() {
        if (c_context == null) {							
            //c_context = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
        	c_context = new AnnotationConfigApplicationContext(SpringApplicationContext.class);
        }
    }
    
    /**
     * Method to retrieve the singleton Spring application context for IOC and AOP functionality.
     * @return the <code>ApplicationContext</code>
     */
    public static ApplicationContext getContext() {
        if (c_context == null) {
            initializeContext();
        }
        return c_context;
    }
    
    /* Return bean*/
    public static Object getBeanInstance(String beanName) {
     	Object obj = SpringApplicationContext.getContext().getBean(beanName);
        return obj;
    }
    
    
}
