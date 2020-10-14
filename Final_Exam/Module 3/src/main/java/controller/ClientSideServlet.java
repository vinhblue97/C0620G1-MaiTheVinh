package controller;

import bo.ProductBO;
import bo.ProductBOImpl;
import bo.catefory.CategoryBO;
import bo.catefory.CategoryBOImpl;
import model.ClientSide;
import model.Category;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ExamServlet", urlPatterns = {"", "/exam", "/product","/"})
public class AreaServlet extends HttpServlet {

    ProductBO productBo = new ProductBOImpl();
    CategoryBO categoryBO = new CategoryBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "read":
                readList(request, response);
                break;
            case "update":
                break;
            case "delete":
                break;
            case "find":
                find(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "read":
                readList(request, response);
                break;
            case "update":
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                readList(request, response);
        }
    }
    //Function Create

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<ClientSide> clientSideList = this.productBo.findAll();
        List<Category> categoryList = this.categoryBO.findAll();
        String id = request.getParameter("_id");
        String name = request.getParameter("_name");
        String price = request.getParameter("price");
        String quantity = request.getParameter("quantity");
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category_id = request.getParameter("category_id");
        ClientSide clientSide = new ClientSide(id, name, price, quantity, color, description, category_id);
        request.setAttribute("productList", clientSideList);
        request.setAttribute("categoryList", categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("read_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // function Readlist
    private void readList(HttpServletRequest request, HttpServletResponse response) {
        List<ClientSide> clientSideList = this.productBo.findAll();
        List<Category> categoryList = this.categoryBO.findAll();
        request.setAttribute("productList", clientSideList);
        request.setAttribute("categoryList", categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("read_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void find(HttpServletRequest request, HttpServletResponse response) {
        String find_name = request.getParameter("find_name");
        String find_price = request.getParameter("find_price");
        List<ClientSide> clientSideList = this.productBo.find(find_name, find_price);
        request.setAttribute("productList", clientSideList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("read_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function delete
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("_id");
        this.productBo.delete(id);
        response.sendRedirect("/exam?action=read");
    }
}
