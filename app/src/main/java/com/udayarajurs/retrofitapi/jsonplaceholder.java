package com.udayarajurs.retrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface jsonplaceholder {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/2/comments")
    Call<List<Comments>> getComments();
}
