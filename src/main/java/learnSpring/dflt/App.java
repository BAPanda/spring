package learnSpring.dflt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learnSpring.dflt.ch2.MessageRenderer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {                        
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
		
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);		
		mr.render();
	}
}
