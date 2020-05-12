package com.example.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sobestudo.ImagensFragAdapter;
import com.example.Adapters.PageAdapter;
import com.example.Fragments.AlbunsFragment;
import com.example.Fragments.ImagensFragment;
import com.example.Fragments.MusicaFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private PageAdapter pageAdapter;
    private ImagensFragAdapter imagensFragAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);


        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(),getListFragments(),getListNames());
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(pageAdapter);

//        ImagensFragAdapter imagensFragAdapter = new ImagensFragAdapter(getSupportFragmentManager(),getListImagens());
//        viewPager.setAdapter(imagensFragAdapter);

    }
//    private List<Fragment> getListImagens() {
//        List<Fragment> list =new ArrayList<>();
//        list.add(ImagensViewFragment.newInstance(R.drawable.banda1));
//        list.add(ImagensViewFragment.newInstance(R.drawable.banda2));
//        list.add(ImagensViewFragment.newInstance(R.drawable.banda3));
//        list.add(ImagensViewFragment.newInstance(R.drawable.banda4));
//        list.add(ImagensViewFragment.newInstance(R.drawable.banda5));
//        return list;
//    }

    private List<Fragment> getListFragments() {
        List<Fragment> list = new ArrayList<>();
        list.add(MusicaFragment.newInstance());
        list.add(ImagensFragment.newInstance());
        list.add(AlbunsFragment.newInstance());
        return list;
    }
    private List<String> getListNames() {
        List<String> list = new ArrayList<>();
        list.add("Músicas");
        list.add("Imagens");
        list.add("Álbuns");
        return list;
    }

}
