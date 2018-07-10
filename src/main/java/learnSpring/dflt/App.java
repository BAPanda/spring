package learnSpring.dflt;

import learnSpring.dflt.ch2.HelloWorldMessageProvider;
import learnSpring.dflt.ch2.MessageProvider;
import learnSpring.dflt.ch2.MessageRenderer;
import learnSpring.dflt.ch2.StandartOutMessageRenderer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MessageRenderer mr = new StandartOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		
		mr.setMessageProvider(mp);
		mr.render();
	}
}
