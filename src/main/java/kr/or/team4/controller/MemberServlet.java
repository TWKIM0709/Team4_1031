package kr.or.team4.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberServlet() {
        super();
       
    }
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글 처리
				request.setCharacterEncoding("UTF-8");
				
				//2. 데이터 받기 (입력데이터 , command)
				String requestURI = request.getRequestURI();
				String contextPath = request.getContextPath();
				String urlcommand = requestURI.substring(contextPath.length());
				
				/*
				 * 	주소가 http://192.168.0.22:8090/WebServlet/register.do 라면
				 * requestURI 		: /WebServlet/register.do
				 * contextPath 	: WebServlet
				 * urlcommand	: /register.do
				 * 
				 * URL 마지막 주소를 추출하고 판단의 근거로 삼기
				 */
				
				String viewpage = "";
				//3. 요청 서비스 판단 (command 값을 비교해서)
				//4. 데이터 저장 
				if(urlcommand.equals("/login.do")) {
					//로그인
					viewpage="";
					
					//session에 id 설정
				} else if(urlcommand.equals("/register.do")) {
					// 회원가입
					
				} else if(urlcommand.equals("/alllist.do")) {
					// 전체조회
				
					// request.setAttribute("list",여기에값)
				} else if(urlcommand.equals("/search.do")) {
					// 조건조회
					
					// request.setAttribute("list",여기에값)
				} else if(urlcommand.equals("/update.do")) {
					// 수정
				
					//수정 후 전체조회로
				} else if(urlcommand.equals("/delete.do")) {
					// 삭제
					
					//삭제 후 전체조회로
				} 
				// ... else if 반복
				//5. View 지정
				RequestDispatcher dis = request.getRequestDispatcher(viewpage);
				
				dis.forward(request, response);
				//forward
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
