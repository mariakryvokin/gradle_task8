import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    private static Logger logger = LogManager.getLogger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Hello from service module");
        PersonService personService = new PersonService();
        personService.savePerson(new Person());
        logger.info(personService.getAll());
        req.setAttribute("Person", personService.getAll().get(0));
        req.getRequestDispatcher("simple.jsp").forward(req, resp);
    }

}
