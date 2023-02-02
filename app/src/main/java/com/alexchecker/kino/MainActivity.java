package com.alexchecker.kino;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.alexchecker.kino.API.ApiInterface;
import com.alexchecker.kino.API.RequestBuilder;
import com.alexchecker.kino.API.TopHundred;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopRated top = new TopRated();

        BottomNavigationView bottom = findViewById(R.id.bottomNavigationView);
        setFrag(new Waitiing());
        bottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.waited:
                        setFrag(new Waitiing());
                        return true;
                    case R.id.top_rated:
                        setFrag(top);
                        return true;

                }
                return false;
            }
        });


    }

    public void setFrag(Fragment frag)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_space, frag, null).commit();
    }


    public void test(View view) {
        ApiInterface interfac = RequestBuilder.buildRequest().create(ApiInterface.class);

        Call<TopHundred> resp =interfac.getTopHundred();

        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();

        resp.enqueue(new Callback<TopHundred>() {
            @Override
            public void onResponse(Call<TopHundred> call, Response<TopHundred> response) {
                if(response.isSuccessful())
                {
                    Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TopHundred> call, Throwable t) {

            }
        });
    }
}