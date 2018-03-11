package franklin.register_graves2;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Tim Newport on 3/11/2018.
 */

public final class HttpUtils {
    // CONNECTION_TIMEOUT and READ_TIMEOUT are in milliseconds
    public static final int CONNECTION_TIMEOUT=10000;
    public static final int READ_TIMEOUT=15000;

    public static void sendRequest(Context context, String urlText, HttpResponse response, Uri.Builder parameterBuilder) {
        new UserLoginTask(context, response).execute(urlText, parameterBuilder);
    }

    private static class UserLoginTask extends AsyncTask<Object, Void, Object> {

        private Context context;
        private HttpResponse response;
        private ProgressDialog dialog;

        public UserLoginTask(Context context, HttpResponse response) {
            this.context = context;
            this.response = response;
        }

        @Override
        protected void onPreExecute() {
            dialog = new ProgressDialog(context);
            dialog.setMessage(context.getResources().getString(R.string.loading));
            dialog.setCancelable(true);
            dialog.setIndeterminate(true);
            dialog.show();
        }

        @Override
        protected void onPostExecute(Object o) {
            dialog.dismiss();
            if (o instanceof Exception) {
                response.exceptionCaught((Exception) o);
            } else if (o instanceof JSONObject) {
                response.handle((JSONObject) o);
            } else {
                response.handle((String) o);
            }
        }

        @Override
        protected Object doInBackground(Object... params) {
            try {
                URL url = new URL((String) params[0]);
                //String user_name = (String)params[1];
                //String password = (String)params[2];

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setRequestMethod("POST");
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setConnectTimeout(CONNECTION_TIMEOUT);
                //conn.setRequestProperty("User-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");

                if (params[1] != null) {
                    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                    out.write(((Uri.Builder) params[1]).build().getEncodedQuery());
                    out.close();
                }
                conn.connect();

                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    StringBuilder builder = new StringBuilder();
                    String line = null;
                    while ((line = in.readLine()) != null) {
                        builder.append(line);
                    }
                    String result = builder.toString();
                    try {
                        return new JSONObject(result);
                    } catch (JSONException ex) {
                        return result;
                    }
                }
            } catch (Exception e) {
                return e;
            }
            return null;
        }
    }

}
