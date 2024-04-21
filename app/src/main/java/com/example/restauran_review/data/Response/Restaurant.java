package com.example.restauran_review.data.Response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Restaurant{

    @SerializedName("customerReviews")
    private List<CustomerReviewItems> customerReviews;

    @SerializedName("name")
    private String name;

    @SerializedName("rating")
    private Object rating;

    @SerializedName("description")
    private String description;

    @SerializedName("id")
    private String id;

    @SerializedName("pictureId")
    private String picture;

    public List<CustomerReviewItems> getCustomerReviews(){
        return customerReviews;
    }

    public String getName(){
        return name;
    }

    public Object getRating(){
        return rating;
    }

    public String getDescription(){
        return description;
    }

    public String getId(){
        return id;
    }

    public String getPictureId(){
        return picture;
    }
}

