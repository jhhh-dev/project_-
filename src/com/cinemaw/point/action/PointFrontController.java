package com.cinemaw.point.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PointFrontController extends HttpServlet {

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(" GET,POST방식 모두 호출 - doProcess() 실행 ");

		System.out.println("\n 1. 가상주소 계산 - 시작");
		// 1. 가상주소 계산------------------------------------------------
		String requestURI = request.getRequestURI();
		System.out.println(" C : requestURI : " + requestURI);

		String ctxPath = request.getContextPath();
		System.out.println(" C : ctxPath : " + ctxPath);

		String command = requestURI.substring(ctxPath.length());
		System.out.println(" C : command : " + command);
		// 1. 가상주소 계산------------------------------------------------
		System.out.println(" 1. 가상주소 계산 - 끝 \n");

		System.out.println("\n  2. 가상주소 매핑 - 시작");
		// 2. 가상주소 매핑------------------------------------------------
		Action action = null;
		ActionForward forward = null;

		if(command.equals("/PointAction.po")){
			
			System.out.println(" C : /PointAction.po 호출 ");
			System.out.println(" C : DB정보가 필요-view페이지로 이동 ");
			
			
			action = new PointAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/mypoint.po")){
		
		System.out.println(" C : /mypoint.po 호출 ");
		System.out.println(" C : DB정보가 필요,페이지 이동x,페이지 출력o ");
		
		
		action= new PointAction();
		try {
			forward = action.execute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

		// 2. 가상주소 매핑------------------------------------------------
		System.out.println("  2. 가상주소 매핑 - 끝 \n");

		System.out.println("\n  3. 가상주소 이동 - 시작");
		// 3. 가상주소 이동------------------------------------------------
		if (forward != null) {
			// 페이지 이동정보가 있을때

			if (forward.isRedirect()) {
				// true - sendRedirect() 방식으로 이동
				System.out.println(" C : true-" + forward.getPath() + "이동, sendRedirect() 방식");
				response.sendRedirect(forward.getPath());

			} else {
				// false - forward() 방식으로 이동
				System.out.println(" C : false-" + forward.getPath() + "이동, forward() 방식");
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}

		}
		// 3. 가상주소 이동------------------------------------------------
		System.out.println("\n  3. 가상주소 이동 - 끝");
	}
	//////////////////////////////// doProcess////////////////////////////////////

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
