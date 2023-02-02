package com.alexchecker.kino.API;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;

public class NetworkImage extends AsyncTask<String, Void, Drawable> {


    @Override
    protected Drawable doInBackground(String... strings) {
        Drawable drawable = null;
        try {
            drawable = Drawable.createFromStream(
                    new URL(strings[0]).openStream(), "image.jpg");
        } catch (IOException e) {
            Log.d("test", e.getMessage());
        }
        if (drawable == null) {
            Log.d("test", "null drawable");
        } else {
            Log.d("test", "not null drawable");
        }
        return drawable;
    }




}
