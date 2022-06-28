package com.example.androidclassapllication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new FoodHomeFragment()).commit();

     bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
         @Override
         public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             Log.i("TAG", "onNavigationItemSelected: "+item.getItemId());

             switch (item.getItemId()){
                 case R.id.home:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container,new FoodHomeFragment()).commit();
                     break;
                 case R.id.cart:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container,new CartFragment()).commit();
                     break;
                 case R.id.favorites:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container,new FavoriteFragment()).commit();
                     break;
                 case R.id.profile:
                     getSupportFragmentManager().beginTransaction().replace(R.id.container,new ProfileFragment()).commit();
                 break;



             }

             return true;
         }
     });

    }
}