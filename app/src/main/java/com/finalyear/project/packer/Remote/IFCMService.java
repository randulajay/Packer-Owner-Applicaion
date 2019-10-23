package com.finalyear.project.packer.Remote;

import com.finalyear.project.packer.Model.FCMResponse;
import com.finalyear.project.packer.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA2XqEuaM:APA91bHU2M8V36SukDgluMR9XqydkyDw3fSrVPRdZ_GsBXens31bPj7hRVKEmdTlDh54R_-knCit2R_hESvmbSqywppG2mILe5Q8VlQ4qgfiorAZxPNYD-qY1DgOhriJpCtxG_2E6WuJ"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);

}
