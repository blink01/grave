package franklin.register_graves2;

import org.json.JSONObject;

/**
 * Created by Tim Newport on 3/11/2018.
 */

public interface HttpResponse {
    void handle(JSONObject json);

    void handle(String s);

    void exceptionCaught(Exception e);

}
