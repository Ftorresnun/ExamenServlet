package servlet.InsertItems;

import java.io.IOException;
import java.util.Optional;
import models.items;
import repository.itemsRepository;
import servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="insertItemsList", value="/insertItemsList")
public class insertItemsList extends BaseServlet{

	itemsRepository repository = new itemsRepository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		items i = getItemFromRequest(req);
		repository.insert(i);
		redirect(req, resp, "/insertItems/insertItemsList.jsp");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

}
