package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.model.Review;

import java.util.List;

public interface ReviewMapper {
    void insertReview(Review review);
    Review getReviewById(int reviewId);
    List<Review> getReviewsByPage(@Param("pageSize") int pageSize, @Param("offset") int offset);
    int getTotalReviewCount();
    List<Review> getReviewsByBookTypeAndTitle(@Param("bookType") String bookType, @Param("search") String search, @Param("pageSize") int pageSize, @Param("offset") int offset);
    int getTotalReviewsByBookTypeAndTitle(@Param("bookType") String bookType, @Param("search") String search);
    List<Review> getReviewsByTitle(@Param("search") String search, @Param("pageSize") int pageSize, @Param("offset") int offset);
    int getTotalReviewsByTitle(@Param("search") String search);
    int getTotalReviewsByBookType(String bookType);
    List<Review> getReviewsByBookType(@Param("bookType") String bookType, @Param("pageSize") int pageSize, @Param("offset") int offset);
}
