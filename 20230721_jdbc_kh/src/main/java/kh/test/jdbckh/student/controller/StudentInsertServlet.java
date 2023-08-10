package kh.test.jdbckh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentInsertServlet
 */
@WebServlet("/student/insert")
public class StudentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     //private ProfessorService serviceprof= new DepartmentService();
     
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsertServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.전달받은 parmeter 읽어내기
		//2. 전달받은 데이터를 활용해 db 정보 가져오기
		// 학과번호. 지도교수번호
		//3.db로부터 전달받은 데이터를 jsp에 전달함.
		//jsp 파일 forward로 열기
		
		request.getRequestDispatcher("/WEB-INF/view/student/insert.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//	}
}