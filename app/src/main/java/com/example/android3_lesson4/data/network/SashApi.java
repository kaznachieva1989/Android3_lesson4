package com.example.android3_lesson4.data.network;

import android.content.Intent;

import com.example.android3_lesson4.data.models.Post;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SashApi {

    @GET("posts/{postId}")
    Call<Post> getPost(
            @Path("postId") Integer postId
    );

}
