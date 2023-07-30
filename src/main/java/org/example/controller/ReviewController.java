package org.example.controller;

import org.example.model.Review;
import org.example.model.ReviewDAO;
import org.example.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReviewController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int reviewId = Integer.parseInt(request.getParameter("reviewId"));

        ReviewDAO reviewDAO = new ReviewDAO();
        Review review = reviewDAO.getReviewById(reviewId);

        request.setAttribute("review", review);
        return "/review/review_view";
    }
}
