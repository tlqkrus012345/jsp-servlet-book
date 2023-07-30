package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.model.Review;

import java.util.List;

public interface ReviewMapper {
    void insertReview(Review review);
    List<Review> getReviewsByPage(@Param("pageSize") int pageSize, @Param("offset") int offset);
    int getTotalReviewCount();
}
