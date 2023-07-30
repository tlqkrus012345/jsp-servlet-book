package org.example.controller;

import org.example.model.Review;
import org.example.model.ReviewDAO;
import org.example.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ReviewListController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pageSize = 5;

        int totalReviewCount = new ReviewDAO().getTotalReviewCount();
        int totalPages = (int) Math.ceil((double) totalReviewCount / pageSize);

        int page = 1;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
            if (page > totalPages) {
                page = totalPages;
            }
        }

        ReviewDAO reviewDAO = new ReviewDAO();
        List<Review> reviews = reviewDAO.getReviewsByPage(page, pageSize);

        request.setAttribute("reviews", reviews);
        request.setAttribute("currentPage", page);
        request.setAttribute("totalPages", totalPages);
        return "/review/review";
    }
}
