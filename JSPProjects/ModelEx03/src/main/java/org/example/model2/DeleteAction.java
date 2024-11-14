package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model1.BoardDAO;
import org.example.model1.BoardTO;

public class DeleteAction implements Action {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("DeleteAction 호출");
        BoardTO to = new BoardTO();
        to.setSeq(req.getParameter("seq"));

        BoardDAO dao = new BoardDAO();
        to = dao.boardDelete(to);

        req.setAttribute("to", to);
    }
}
