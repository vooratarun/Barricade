package com.mutualmobile.barricade.sample.api;

import com.mutualmobile.barricade.annotation.Barricade;
import com.mutualmobile.barricade.annotation.Response;
import com.mutualmobile.barricade.sample.api.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ChuckNorrisApiService {

  @GET("/jokes/random") @Barricade(endpoint = "random", responses = {
      @Response(fileName = "success", isDefault = true), @Response(fileName = "failure")
  }) Call<Joke> getRandomJoke();
}