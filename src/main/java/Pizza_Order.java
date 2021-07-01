import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

@WebServlet (name="Pizza_Order",urlPatterns = "/pizza-order")
public class Pizza_Order extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] toppings = req.getParameterValues("toppings");
        String street = req.getParameter("street");
        String city = req.getParameter("city");
//        req.setAttribute("size", size);
//        req.setAttribute("crust", crust);
//        req.setAttribute("sauce", sauce);
//        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);
        resp.sendRedirect("/pizza-order.jsp");
        System.out.print("Size: ");
        System.out.println(size);
        System.out.print("Crust: ");
        System.out.println(crust);
        System.out.print("Sauce: ");
        System.out.println(sauce);
        System.out.println("Toppings:");
        for(int i = 0; i < toppings.length; i++) {
            System.out.println(toppings[i]);
        }
        System.out.print("Street: ");
        System.out.println(street);
        System.out.print("City: ");
        System.out.println(city);
    }

}
