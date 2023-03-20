package com.alexchecker.kino;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.alexchecker.kino.API.ApiInterface;
import com.alexchecker.kino.API.Film;
import com.alexchecker.kino.API.RequestBuilder;
import com.alexchecker.kino.API.TopHundred;
import com.alexchecker.kino.adapters.TopRatedAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TopRated extends Fragment {

    public FragmentManager frag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_top_rated, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ProgressBar pb = view.findViewById(R.id.pb);
        RecyclerView top= view.findViewById(R.id.top_rated);

        ApiInterface interfac = RequestBuilder.buildRequest().create(ApiInterface.class);

        Call<TopHundred> resp =interfac.getTopHundred();




        resp.enqueue(new Callback<TopHundred>() {
            @Override
            public void onResponse(Call<TopHundred> call, Response<TopHundred> response) {
                if(response.isSuccessful())
                {
                    top.setLayoutManager(new LinearLayoutManager(getContext()));
                    top.setHasFixedSize(true);
                    ArrayList<Film> films = response.body().getFilms();
                    TopRatedAdapter adp = new TopRatedAdapter(films,frag);
                    top.setAdapter(adp);
                    pb.setVisibility(View.GONE);
                }
                else
                {
                    Toast.makeText(getContext(), "Технические шъкаладки", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TopHundred> call, Throwable t) {
                Toast.makeText(getContext(), "Fail!", Toast.LENGTH_SHORT).show();
            }
        });
    }



}