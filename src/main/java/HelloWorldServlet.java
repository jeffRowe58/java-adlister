import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    private int counter = 1;

    public int visitCounter(){
        return counter = counter + 1;
    }

    public void reset(){
        counter = 1;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if (name == null) {
            out.println("<h1>Hello, World!</h1>");
            out.println("<h1>Visits: " + counter + "</h1>");
            visitCounter();
        } else if(name.equalsIgnoreCase("reset")) {
                reset();
                out.println("<h1>Hello, World!</h1>");
                out.println("<h1>Visits: " + counter + "</h1>");
        }else{
                out.println("<h1>Hello, " + name + "!</h1>");
                out.println("<h1>Visits: " + counter + "</h1>");
                visitCounter();
            }
        }
    }




