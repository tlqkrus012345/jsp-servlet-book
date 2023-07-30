package org.example.controller;

import org.example.model.BookType;
import org.example.model.Review;
import org.example.model.ReviewDAO;
import org.example.model.User;
import org.example.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReviewCreateController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        String userNickName = user.getUserNickName();

        String reviewTitle = request.getParameter("reviewTitle");
        String reviewContent = request.getParameter("reviewContent");
        String bookTypeValue = request.getParameter("bookType");
        String bookTitle = request.getParameter("bookTitle");
        String bookAuthor = request.getParameter("bookAuthor");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double reviewScore = Double.parseDouble(request.getParameter("reviewScore"));

        BookType bookType = BookType.fromValue(bookTypeValue);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startD = sdf.parse(startDate);
        Date endD = sdf.parse(endDate);

        Review review = new Review();
        review.setReviewTitle(reviewTitle);
        review.setReviewContent(reviewContent);
        review.setBookType(bookType);
        review.setBookTitle(bookTitle);
        review.setBookAuthor(bookAuthor);
        review.setStartDate(startD);
        review.setEndDate(endD);
        review.setReviewScore(reviewScore);
        review.setWriterNickName(userNickName);

        ReviewDAO reviewDAO = new ReviewDAO();
        reviewDAO.insertReview(review);

        List<Review> reviews = reviewDAO.getReviewsByPage(1,5);

        int totalReviewCount = reviewDAO.getTotalReviewCount();

        request.setAttribute("reviews", reviews);
        request.setAttribute("totalPages",totalReviewCount);
        return "/review/review";
    }
}
