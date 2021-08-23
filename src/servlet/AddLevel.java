package servlet;

import layer.bl.BLImpl;
import layer.pl.PLException;
import layer.pl.UserDataBean;
import layer.pl.db.PGDBImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by hanieh on 8/7/2017 AD.
 */
public class AddLevel extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primaryColors[][] = new String[][]{
                {request.getParameter("b0,0"), request.getParameter("b0,1"), request.getParameter("b0,2"),request.getParameter("b0,3"), request.getParameter("b0,4")},
                {request.getParameter("b1,0"), request.getParameter("b1,1"), request.getParameter("b1,2"),request.getParameter("b1,3"), request.getParameter("b1,4")},
                {request.getParameter("b2,0"), request.getParameter("b2,1"), request.getParameter("b2,2"),request.getParameter("b2,3"), request.getParameter("b2,4")},
                {request.getParameter("b3,0"), request.getParameter("b3,1"), request.getParameter("b3,2"),request.getParameter("b3,3"), request.getParameter("b3,4")}
        };
        final String endcolors[][] = new String[][]{
                {request.getParameter("0,0"), request.getParameter("0,1"), request.getParameter("0,2"),request.getParameter("0,3"), request.getParameter("0,4")},
                {request.getParameter("1,0"), request.getParameter("1,1"), request.getParameter("1,2"),request.getParameter("1,3"), request.getParameter("1,4")},
                {request.getParameter("2,0"), request.getParameter("2,1"), request.getParameter("2,2"),request.getParameter("2,3"), request.getParameter("2,4")},
                {request.getParameter("3,0"), request.getParameter("3,1"), request.getParameter("3,2"),request.getParameter("3,3"), request.getParameter("3,4")}
        };
        BLImpl bl=new BLImpl(new PGDBImpl());
        try {
            bl.addLevel(16,primaryColors,endcolors);
        } catch (PLException e) {
            e.printStackTrace();
        }
 }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }}
