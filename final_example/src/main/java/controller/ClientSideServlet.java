package controller;

import bo.ClientSideBO;
import bo.ClientSideBOImpl;
import bo.office_type.OfficeTypeBO;
import bo.office_type.OfficeTypeBOImpl;
import model.ClientSide;
import model.OfficeType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ExamServlet", urlPatterns = {"", "/exam", "/product","/clientSide"})
public class ClientSideServlet extends HttpServlet {

    ClientSideBO clientSideBo = new ClientSideBOImpl();
    OfficeTypeBO officeTypeBO = new OfficeTypeBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                create(request, response);
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

//    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        List<ClientSide> clientSideList = this.productBo.findAll();
//        List<OfficeType> officeTypeList = this.categoryBO.findAll();
//        String id = request.getParameter("_id");
//        String name = request.getParameter("_name");
//        String price = request.getParameter("price");
//        String quantity = request.getParameter("quantity");
//        String color = request.getParameter("color");
//        String description = request.getParameter("description");
//        String category_id = request.getParameter("category_id");
//        ClientSide clientSide = new ClientSide(id, name, price, quantity, color, description, category_id);
//        request.setAttribute("productList", clientSideList);
//        request.setAttribute("categoryList", officeTypeList);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("read_list.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    // function Readlist
    private void readList(HttpServletRequest request, HttpServletResponse response) {
        List<ClientSide> clientSideList = this.clientSideBo.findAll();
        List<OfficeType> officeTypeList = this.officeTypeBO.findAll();
        request.setAttribute("clientSideList", clientSideList);
        request.setAttribute("officeTypeList", officeTypeList);
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
        List<ClientSide> clientSideList = this.clientSideBo.find(find_name, find_price);
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
        this.clientSideBo.delete(id);
        response.sendRedirect("/exam?action=read");
    }
}
