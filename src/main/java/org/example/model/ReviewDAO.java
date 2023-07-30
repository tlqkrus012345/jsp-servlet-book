package org.example.model;

import org.example.mapper.ReviewMapper;
import org.example.utils.MyBatisUtils;

import java.util.List;

public class ReviewDAO {

    public static final int PAGE_SIZE = 5;
    private final ReviewMapper reviewMapper;
    public ReviewDAO() {
        reviewMapper = MyBatisUtils.getSqlSession().getMapper(ReviewMapper.class);
    }
    public void insertReview(Review review) {
        try {
            reviewMapper.insertReview(review);
            MyBatisUtils.getSqlSession().commit();

        } catch (Exception e) {
            MyBatisUtils.getSqlSession().rollback();
            throw e;

        } finally {
            MyBatisUtils.getSqlSession().close();
        }
    }
    public Review getReviewById(int reviewId) {
        return reviewMapper.getReviewById(reviewId);
    }
    public List<Review> getReviewsByPage(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        return reviewMapper.getReviewsByPage(pageSize, offset);
    }
    public int getTotalReviewCount() {
        return reviewMapper.getTotalReviewCount();
    }

    public List<Review> getReviewsByBookTypeAndTitle(String bookType, String search, int page) {
        int offset = (page - 1) * PAGE_SIZE;
        return reviewMapper.getReviewsByBookTypeAndTitle(bookType, search, PAGE_SIZE, offset);
    }

    public int getTotalReviewsByBookTypeAndTitle(String bookType, String search) {
        return reviewMapper.getTotalReviewsByBookTypeAndTitle(bookType, search);
    }

    public List<Review> getReviewsByBookType(String bookType, int page) {
        int offset = (page - 1) * PAGE_SIZE;
        return reviewMapper.getReviewsByBookType(bookType, PAGE_SIZE, offset);
    }

    public int getTotalReviewsByBookType(String bookType) {
        return reviewMapper.getTotalReviewsByBookType(bookType);
    }

    public List<Review> getReviewsByTitle(String search, int page) {
        int offset = (page - 1) * PAGE_SIZE;
        return reviewMapper.getReviewsByTitle(search, PAGE_SIZE, offset);
    }

    public int getTotalReviewsByTitle(String search) {
        return reviewMapper.getTotalReviewsByTitle(search);
    }

    public List<Review> getAllReviews(int page) {
        int offset = (page - 1) * PAGE_SIZE;
        return reviewMapper.getReviewsByPage(PAGE_SIZE, offset);
    }
   
}
