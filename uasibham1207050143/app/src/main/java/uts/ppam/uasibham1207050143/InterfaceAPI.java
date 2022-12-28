package uts.ppam.uasibham1207050143;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceAPI {

    @GET("uasresto")
    Call<List<Posts>> getPosts();
}