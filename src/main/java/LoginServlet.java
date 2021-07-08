import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("isAdmin") != null) {
            response.sendRedirect("/WEB-INF/secret-admin-page.jsp");
            return;
        } else if (request.getSession().getAttribute("isUser") != null) {
            response.sendRedirect("/profile");
            return;
        } else {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isAdmin = username.equals("admin") && password.equals("password");
        boolean isUser = username.equals("jeff") && password.equals("yup");

//        HttpSession session = request.getSession();

        if (isAdmin) {
            request.getSession().setAttribute("isAdmin", username);
            response.sendRedirect("/secret-admin-page");
        } else if(isUser){
            request.getSession().setAttribute("isUser", username);
            response.sendRedirect("/profile");
            System.out.println(request.getSession().getAttribute("isUser"));
        }else{
                response.sendRedirect("/login");
            }
    }
}



