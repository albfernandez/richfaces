package org.richfaces.renderkit.html;

public class NoSuchComponentException extends Exception {

	private static final long serialVersionUID = 7933706104795250569L;

	public NoSuchComponentException() {
        super();
    }

    public NoSuchComponentException(String message) {
        super(message);
    }

    public NoSuchComponentException(Throwable cause) {
        super(cause);
    }

    public NoSuchComponentException(String message, Throwable cause) {
        super(message, cause);
    }
}
