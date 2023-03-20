package com.alexchecker.kino;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alexchecker.kino.API.ApiInterface;
import com.alexchecker.kino.API.NetworkImage;
import com.alexchecker.kino.API.RequestBuilder;

import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmInfo extends Fragment {

    public int id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_info, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);

        ApiInterface apiInterface = RequestBuilder.buildRequest().create(ApiInterface.class);
        Call<com.alexchecker.kino.API.FilmInfo> response = apiInterface.getFilmInfo(id);

        response.enqueue(new Callback<com.alexchecker.kino.API.FilmInfo>() {
            @Override
            public void onResponse(Call<com.alexchecker.kino.API.FilmInfo> call, Response<com.alexchecker.kino.API.FilmInfo> response) {
                if(response.isSuccessful())
                {
                    com.alexchecker.kino.API.FilmInfo info = response.body();
                    NetworkImage img = new NetworkImage();
                    ImageView imageView = view.findViewById(R.id.FilmImage);
                    img.execute(info.getPosterUrlPreview());
                    try {
                        imageView.setImageDrawable(img.get());
                    }catch (ExecutionException e) {
                    } catch (InterruptedException e) {
                    }
                    TextView name = view.findViewById(R.id.FilmName);
                    name.setText(info.getNameRu());
                    TextView rating = view.findViewById(R.id.FilmRating);
                    rating.setText((info.getRatingKinopoisk() == null)?"Рейтинг недоступен":info.getRatingKinopoisk().toString());
                    TextView date = view.findViewById(R.id.FilmDateInfo);
                    date.setText(info.getYear().toString());
                    TextView description = view.findViewById(R.id.FilmDescription);
                    description.setText(info.getDescription());
                }
                else
                {
                    Toast.makeText(getContext(), "Технические шъкаладки", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<com.alexchecker.kino.API.FilmInfo> call, Throwable t) {
                Toast.makeText(getContext(), "Fail!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}