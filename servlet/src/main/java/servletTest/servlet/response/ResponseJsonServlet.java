package servletTest.servlet.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import servletTest.servlet.helloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        helloData helloData = new helloData();
        helloData.setUsername("jun");
        helloData.setAge(30);

        String result = objectMapper.writeValueAsString(helloData);

        response.getWriter().write(result);
    }
}
