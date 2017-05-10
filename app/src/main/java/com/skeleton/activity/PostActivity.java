package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.adapter.PostDataAdapter;
import com.skeleton.modal.PostData;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

/**
 * Created by admin23 on 9/5/17.
 */

public class PostActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private PostDataAdapter adapter;
    private int userId;

    /**
     * @param savedInstanceState current instance is saved;
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);


        Intent i = getIntent();
        userId = i.getIntExtra("userId", 1);


        RestClient.getApiInterface().getPosts(userId).enqueue(new ResponseResolver<List<PostData>>(this, true) {
            /**
             *
             * @param posts posts
             */

            @Override
            public void success(final List<PostData> posts) {
                recyclerView = (RecyclerView) findViewById(R.id.rv_post);
                adapter = new PostDataAdapter(PostActivity.this, posts);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(PostActivity.this));

            }

            /**
             *
             * @param error the error
             */
            @Override
            public void failure(final APIError error) {
                Toast.makeText(getApplicationContext(), "failed execution", Toast.LENGTH_LONG).show();

            }
        });

    }





}
