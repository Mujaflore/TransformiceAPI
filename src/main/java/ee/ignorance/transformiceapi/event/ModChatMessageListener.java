package ee.ignorance.transformiceapi.event;


public abstract class ModChatMessageListener implements EventListener{

	@Override
	public boolean matches(Event e) {
		return e instanceof ModChatMessageEvent;
	}


}
