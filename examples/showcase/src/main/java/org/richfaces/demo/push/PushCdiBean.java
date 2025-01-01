package org.richfaces.demo.push;

import org.richfaces.cdi.push.Push;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author <a href="http://community.jboss.org/people/lfryc">Lukas Fryc</a>
 */
@Named
@RequestScoped
public class PushCdiBean {

    public static final String PUSH_CDI_TOPIC = "pushCdi";
    @Inject
    @Push(topic = PUSH_CDI_TOPIC)
    Event<String> pushEvent;
    private String message;

    /**
     * Sends message.
     */
    public void sendMessage() {
        pushEvent.fire(message);
        message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
