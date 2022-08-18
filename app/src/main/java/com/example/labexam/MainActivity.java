package com.example.labexam;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private final int ID_FIRST = 1;
    private final int ID_SECOND = 2;
    private final int ID_THIRD = 3;
    private final int ID_FOURTH = 4;
    Fragment fragment = null;
    TabLayout tabLayout;
    ViewPager2 viewPager2;

    View view = this.getCurrentFocus();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeowBottomNavigation bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_FIRST,R.drawable.ic_baseline_list));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_SECOND,R.drawable.ic_baseline_grid));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_THIRD,R.drawable.ic_baseline_view_list));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_FOURTH,R.drawable.ic_baseline_image));

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

                if(item.getId()==1){
                    Toast.makeText(MainActivity.this, "List of Student", Toast.LENGTH_SHORT).show();
                }else if (item.getId()==2){
                    Toast.makeText(MainActivity.this, "Staggered Grid View", Toast.LENGTH_SHORT).show();
                }else if (item.getId()==3){
                    Toast.makeText(MainActivity.this, "Programming Languages", Toast.LENGTH_SHORT).show();
                }else if (item.getId()==4){
                    Toast.makeText(MainActivity.this, "Images", Toast.LENGTH_SHORT).show();
                }
//                Toast.makeText(MainActivity.this
//                        , "Clicked item: " + item.getId(),Toast.LENGTH_SHORT).show();

            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext()
                        , "You Reselected: " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

//        bottomNavigation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                switch (view.getId()){
//                    case 1:
//                        fragment = new FirstFragment();
//                        break;
//
//                    case 2:
//                        fragment = new SecondFragment();
//                        break;
//
//                    case 3:
//                        fragment = new ThirdFragment();
//                        break;
//                    case 4:
//                        fragment = new FourthFragment();
//                        Toast.makeText(MainActivity.this,"Reloaded",Toast.LENGTH_SHORT).show();
//                        break;
//                }
//                loadFragment(fragment);
//            }
//        });
//        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
//            @Override
//            public void onClickItem(MeowBottomNavigation.Model item) {
//                    Fragment fragment = null;
//                    switch (item.getId()){
//                        case 4:
//                            fragment = new FourthFragment();
//                            Toast.makeText(MainActivity.this,"Reloaded",Toast.LENGTH_SHORT).show();
//                            break;
//                    }
//                    loadFragment(fragment);
//            }
//        });


        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {

//                    fragment = new FirstFragment();
                switch (item.getId()) {
                    case 1:
                        fragment = new FirstFragment();
                        break;

                    case 2:
                        fragment = new SecondFragment();
                        break;

                    case 3:
                        fragment = new ThirdFragment();
                        break;

                    case 4:
                        fragment = new FourthFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });

        bottomNavigation.setCount(1,"5");
        bottomNavigation.show(1, true);



    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
        return;
    }

}