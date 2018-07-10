package learnSpring.dflt.ch2;

public interface MessageRenderer {
	
	void render();
	
	void setMessageProvider(MessageProvider messageProvider);
	
	MessageProvider getMessageProvider();

}
