package com.skeleton.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.skeleton.R;
import com.skeleton.adapter.PagerAdapter;
import com.skeleton.fragment.SignInFragment;
import com.skeleton.fragment.SignUpFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin23 on 10/5/17.
 */

public class LoginSignUpActivity extends BaseActivity {
    private ViewPager viewPager;
    private List<Fragment> fList;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
//        tabLayout.addTab(tabLayout.newTab().setText("sign_up"));
//        tabLayout.addTab(tabLayout.newTab().setText("sign_in"));
        PagerAdapter pagerAdapter = new com.skeleton.adapter.PagerAdapter(getSupportFragmentManager(), fList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    /**
     * init
     */
    private void init() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tl_slide);
        fList = new ArrayList<>();
        fList.add(new SignUpFragment());
        fList.add(new SignInFragment());
    }

}
