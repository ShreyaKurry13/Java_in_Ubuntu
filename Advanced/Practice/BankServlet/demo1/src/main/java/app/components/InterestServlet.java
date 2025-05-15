package app.components;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Interest")
public class InterestServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guest = request.getParameter("user");
        double p = Double.parseDouble(request.getParameter("principal"));
        float r = Float.parseFloat(request.getParameter("rate"));
        int t = Integer.parseInt(request.getParameter("time"));

        double result = p*r*t /100;

        response.setContentType("text/html");
        response.getWriter().printf("""
                 <html>
                    <head>
                        <title>simple-web-app</title>
                    </head>
                    <body>
                        <h1>Hello %s</h1>
                        <b>The Interest on your investment =  </b>%.3f
                    </body>
                </html>
                """,guest,result);
    }
}
