package me.johnkagga.rain;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public static final String TAG = MainActivity.class.getSimpleName();

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String apiKey = "5a20df57556bd8bcb4924c5a083bc653";
        double latitude = 37.8267;
        double longitude =-122.423;

        String forecastUrl = "https://api.forecast.io/forecast/"+ apiKey +"/ "
                + latitude + "," + longitude;

        /*
        calling the client and setting up the request
         */
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(forecastUrl)
                .build();
        Call call = client.newCall(request);

        try {
            Response response = call.execute();
            if (response.isSuccessful()){
                //logging the whole response body
                Log.v(TAG,response.body().string());
            }
        } catch (IOException e) {
            Log.e(TAG, "Exception caught: ",e);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);


    }
}
