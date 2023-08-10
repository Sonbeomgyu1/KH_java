package kh.test.jdbckh.el.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.jdbckh.board.model.service.BoardService;
import kh.test.jdbckh.student.model.service.StudentService;

/**
 * Servlet implementation class ElTestController
 */
@WebServlet("/eltest")
public class ElTestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElTestController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("al", "aaa");
		request.setAttribute("volist", new BoardService().selectList());
		/*request.setAttribute("vo", new StudentService().selectOnestudent(A213046));*/
		request.getRequestDispatcher("/WEB-INF/view/eltest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
