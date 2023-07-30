package org.example.model;

import org.example.mapper.ReviewMapper;
import org.example.utils.MyBatisUtils;

import java.util.List;

public class ReviewDAO {

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
    public List<Review> getReviewsByPage(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        return reviewMapper.getReviewsByPage(pageSize, offset);
    }
    public int getTotalReviewCount() {
        return reviewMapper.getTotalReviewCount();
    }
}
