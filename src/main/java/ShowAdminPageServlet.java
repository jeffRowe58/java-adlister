import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="ShowAdminPageServlet", urlPatterns = "/secret-admin-page")
public class ShowAdminPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/secret-admin-page.jsp").forward(req, resp);
        HttpSession session = req.getSession();

        if((boolean) session.getAttribute("/secret-admin-page.jsp") == false){
            resp.sendRedirect("/login");
            return;
        }
        req.getRequestDispatcher("/secret-admin-page.jsp").forward(req, resp);
    }
}
