package im.recognize.android.Event;

import org.json.JSONArray;

public class SuccessEvent {

    JSONArray objects;

    public SuccessEvent(JSONArray objects) {
        this.objects = objects;
    }

    public JSONArray getObjects() {
        return objects;
    }
}
