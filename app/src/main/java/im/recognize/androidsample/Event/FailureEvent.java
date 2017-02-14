package im.recognize.androidsample.Event;

public class FailureEvent {

    protected String message;

    public FailureEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
