package com.abc.retrofit;

import com.abc.pojo.Login;

import java.util.List;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by anand on 18/5/17.
 */

public interface MInterface {
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Login>> repoContributors(
            @Path("owner") String owner,
            @Path("repo") String repo);

    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor().
            setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient)
            .build();

    @GET("/users/{username}")
    Call<Login>user(
            @Path("username")String login);
}

