package org.example.controller;

import org.example.model.Review;
import org.example.model.ReviewDAO;
import org.example.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class SearchController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String genre = request.getParameter("genre");
        String search = request.getParameter("search");
        int page = 1;

        String pageParam = request.getParameter("page");
        if (pageParam != null && !pageParam.isEmpty()) {
            page = Integer.parseInt(pageParam);
        }

        ReviewDAO reviewDAO = new ReviewDAO();
        List<Review> reviews;
        int totalReviews;

        if (genre != null && !genre.isEmpty() && search != null && !search.isEmpty()) {
            reviews = reviewDAO.getReviewsByBookTypeAndTitle(genre, search, page);
            totalReviews = reviewDAO.getTotalReviewsByBookTypeAndTitle(genre, search);
        } else if (genre != null && !genre.isEmpty()) {
            reviews = reviewDAO.getReviewsByBookType(genre, page);
            totalReviews = reviewDAO.getTotalReviewsByBookType(genre);
        } else if (search != null && !search.isEmpty()) {
            reviews = reviewDAO.getReviewsByTitle(search, page);
            totalReviews = reviewDAO.getTotalReviewsByTitle(search);
        } else {
            reviews = reviewDAO.getAllReviews(page);
            totalReviews = reviewDAO.getTotalReviewCount();
        }

        int totalPages = (int) Math.ceil((double) totalReviews / ReviewDAO.PAGE_SIZE);

        request.setAttribute("reviews", reviews);
        request.setAttribute("totalPages", totalPages);
        request.setAttribute("currentPage", page);

        return "/review/review";
    }
}
