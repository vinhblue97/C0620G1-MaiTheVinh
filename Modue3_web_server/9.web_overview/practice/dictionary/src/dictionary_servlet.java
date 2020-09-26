import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

@WebServlet(name = "dictionary_servlet", urlPatterns = "/dictionary")
public class dictionary_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String keyword = request.getParameter("keyword");
        String result = "";
        for(String key:dictionary.keySet()){
            if (key.equals(keyword)){

                result = dictionary.get(key);
                if(key.equals("how")){
                    result +=" Thế nào là thế nào?\n" +
                            "Thế nào thì làm sao";
                }
            }
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
