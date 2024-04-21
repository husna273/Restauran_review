package com.example.restauran_review.data.Response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PostReviewResponse {
    @SerializedName("customerReviews")
    private List<CustomerReviewItems> customerReviews;

    @SerializedName("error")
    private boolean error;

    @SerializedName("message")
    private String message;

    public List<CustomerReviewItems> getCustomerReviews() {
        return customerReviews;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}

