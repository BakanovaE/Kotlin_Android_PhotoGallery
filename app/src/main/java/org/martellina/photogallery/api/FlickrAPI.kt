package org.martellina.photogallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface FlickrApi {

//    @GET("services/rest/?method=flickr.interestingness.getList" +
//                "&api_key=d7b49d1d2b40309f1f332d3626aa9e9f" +
//                "&extras=url_s" +
//                "&format=json" +
//                "&nojsoncallback=1"
//    )

    @GET("services/rest?method=flickr.interestingness.getList")
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>

    @GET("services/rest?method=flickr.photos.search")
    fun searchPhotos(@Query("text") query: String): Call<FlickrResponse>
}