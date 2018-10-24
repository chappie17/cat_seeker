package com.sdaacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ShowCatServlet extends HttpServlet {

    Collection<Cat> allCats = CatsDB.getAllCats();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("race") != null)
            allCats = allCats.stream().filter(c -> req.getParameter("race").equals(c.getRace())).collect(Collectors.toList());
        req.setAttribute("allCats", allCats);
        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}
