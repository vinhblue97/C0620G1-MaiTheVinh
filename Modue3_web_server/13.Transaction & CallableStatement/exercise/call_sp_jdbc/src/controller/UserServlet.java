package controller;

import bo.UserBO;
import bo.UserBOCallSP;
import bo.UserBOImpl;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"", "/user"})
public class UserServlet extends HttpServlet {

    UserBO userBO = new UserBOImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                try {
                    insertUserStore(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                search(request, response);
                break;
            case "edit":
                editUser(request, response);
                break;
            default:
                listUser(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createForm(request, response);
                break;
            case "search":
                search(request, response);
                break;
            case "permision":
                addUserPermision(request, response);
                break;
            case "edit":
                editUserForm(request, response);
                break;
            default:
                listUser(request, response);
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = this.userBO.findAll();
        request.setAttribute("userList", userList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/user_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("user/create.jsp");
    }

    private void insertUserStore(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        this.userBO.insertUserStore(new User(id, name, email, country));
        response.sendRedirect("/user");
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String search = request.getParameter("search");
        User user = this.userBO.getUserById(Integer.parseInt(search));
        request.setAttribute("user",user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/search.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void addUserPermision(HttpServletRequest request, HttpServletResponse response) {
        User user = new User(4,"kien", "kienhoang@gmail.com", "vn");
        int[] permision = {1, 2, 4};
        this.userBO.addUserTransaction(user, permision);
    }

    private void editUserForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("user/editForm.jsp");
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        this.userBO.editUser(new User(id, name, email, country));
        response.sendRedirect("/user");
    }
}
