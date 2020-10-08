
package login;

import domain.AccountService;
import domain.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("acct");
        if(user != null){
            response.sendRedirect("Home");
        }else{
        getServletContext().getRequestDispatcher("/WEB-INF/loginPage.jsp").forward(request, response);}
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
            String name = request.getParameter("username");
            String password = request.getParameter("password");
        if(!(name.equals("")) && !(password.equals(""))){
                AccountService a = new AccountService();
                User acct = a.login(name,password);
                if(acct != null){
                    session.setAttribute("acct", acct.getUsername());
                    response.sendRedirect("Home");
                    } else {
                        String message = "Wrong login information";
                        request.setAttribute("message", message);
                        getServletContext().getRequestDispatcher("/WEB-INF/loginPage.jsp").forward(request, response);
                }
                
        }else {
            String message = "You must give both username and password";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/loginPage.jsp").forward(request, response);
        }
        

        
    }



}

