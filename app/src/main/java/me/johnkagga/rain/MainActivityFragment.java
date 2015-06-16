package me.johnkagga.rain;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);


    }
}
