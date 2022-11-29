package servlet;

import models.items;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseServlet extends HttpServlet {

    protected void redirect(HttpServletRequest req, HttpServletResponse resp, String jsp) throws ServletException, IOException{
        req.getRequestDispatcher(jsp).forward(req, resp);
    }
    
    protected items getItemFromRequest(HttpServletRequest req) {
		items i = new items();
		i.setItem_name(req.getParameter("item_name"));
		i.setEffect(req.getParameter("effect"));
		return i;
	}
}
