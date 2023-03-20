package com.alexchecker.kino.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alexchecker.kino.API.Film;
import com.alexchecker.kino.API.NetworkImage;
import com.alexchecker.kino.FilmInfo;
import com.alexchecker.kino.MainActivity;
import com.alexchecker.kino.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class TopRatedAdapter extends RecyclerView.Adapter<TopRatedAdapter.ViewHolder> {
    private ArrayList<Film> films;
    private FragmentManager fragManager;

    public TopRatedAdapter(ArrayList<Film> films, FragmentManager frag)
    {
        this.films=films;
        fragManager = frag;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_waiting_element, parent,false);
        return new ViewHolder(view);
    }
    private Drawable loadImageFromNetwork(String imageUrl) {
        Drawable drawable = null;

        try {
            drawable = Drawable.createFromStream(
                    new URL(imageUrl).openStream(), "image.jpg");
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

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getFilmName().setText(films.get(position).getNameRu());
        holder.getRating().setText(films.get(position).getRating());
        holder.getDate().setText(films.get(position).getYear());
        holder.filmID = films.get(position).getFilmId();
        holder.frag = fragManager;
        NetworkImage i =new NetworkImage();
        i.execute(films.get(position).getPosterUrl());
        try {
            holder.getPoster().setImageDrawable(i.get());
        } catch (ExecutionException e) {
        } catch (InterruptedException e) {
        }


    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView filmName;
        private final TextView rating;
        private final TextView date;
        private final ImageView poster;

        public FragmentManager frag;
        public int filmID;
        public ViewHolder(View view)
        {
            super(view);

            filmName=view.findViewById(R.id.filmName);
            rating=view.findViewById(R.id.filmRating);
            date=view.findViewById(R.id.filmDate);
            poster=view.findViewById(R.id.film_poster);
            view.setOnClickListener(this);
        }


        @Override
        public void onClick(View v)
        {
            FilmInfo f = new FilmInfo();
            f.id = filmID;
            frag.beginTransaction().replace(R.id.fragment_space,f,null).commit();
        }

        public TextView getFilmName()
        {
            return filmName;
        }

        public TextView getRating()
        {
            return rating;
        }
        public TextView getDate()
        {
            return date;
        }

        public ImageView getPoster() {
            return poster;
        }
    }
}
