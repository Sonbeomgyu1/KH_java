package kh.test.jdbckh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/Main")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//jsp 한테 리퀘스트 리스판스를 대신 해달라
		request.getRequestDispatcher("/WEB-INF/student/insert.jsp").forward(request, response);
		
		//아래 방식은 mvc model2 방식에서 사용하지 않음. 비추. 위 방식으로 사용함.
		
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append("<h1>하이요</h1>);
		//printWriter io스트림에서 나옴 
//		PrintWriter out = response.getWriter();
//		out.append("<h1>하이요</h1>");
//		out.append("<script>alert('작은따옴표경고창');</script>");
//		out.flush();
//		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
