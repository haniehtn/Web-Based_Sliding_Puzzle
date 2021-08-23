package servlet.levels;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import layer.bl.*;
import layer.pl.db.*;
import layer.pl.UserDataBean;

public class SetDatas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(req, resp);
//		super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

  BLImpl bl = new BLImpl(new PGDBImpl());
  //bl.setLevelMoves((UserDataBean)request.getSession().getAttribute("userData")).getLoginId(),
  //        request.getSession().getAttribute("userName").toString()));
//			try {
//
//        bl.register(name, password);
//        System.out.println("you have registered successfully");
//        request.setAttribute("error", "ثبت نام شما با موفقیت انجام شد");
//        request.getRequestDispatcher("/main.jsp").forward(request, response);
//
    }
}