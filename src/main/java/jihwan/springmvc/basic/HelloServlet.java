package jihwan.springmvc.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    //Servlet이 호촐되면 service 메소드가 호출
    //HTTP 요청이 오면 WAS(Tomcat)이 request, response객체를 만들어서
    //servlet에 던저줌
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain"); // Header
        response.setCharacterEncoding("utf-8");// Header
        response.getWriter().write("hello" + username);// body
    }
}
