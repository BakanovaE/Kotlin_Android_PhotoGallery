package org.martellina.photogallery.api

import com.google.gson.annotations.SerializedName
import org.martellina.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}