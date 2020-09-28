package controller;

import bo.ProductBO;
import model.Product;
import bo.ProductBOImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/product"})
public class ProductServlet extends HttpServlet {

    ProductBO productBO = new ProductBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "update":
                update(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                listProduct(request, response);
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
                createProductForm(request, response);
                break;
            case "update":
                updateForm(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void createProductForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("product/create.jsp");
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer product_id = Integer.parseInt(request.getParameter("product_id"));
        String product_name = request.getParameter("product_name");
        String product_cost = request.getParameter("product_cost");
        String product_dresciption = request.getParameter("product_dresciption");
        String product_producer = request.getParameter("product_producer");
        Product newProduct = new Product(product_id, product_name, product_cost, product_dresciption, product_producer);
        this.productBO.save(newProduct);
        response.sendRedirect("/product");
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Product> productList = this.productBO.findAll();
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/listProduct.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        this.productBO.remove(id);
        response.sendRedirect("/product");
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        Product product = new Product();
        product = this.productBO.search(search);
        request.setAttribute("product_search", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/search.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        request.setAttribute("id",id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String product_name = request.getParameter("product_name");
        String product_cost = request.getParameter("product_cost");
        String product_dresciption = request.getParameter("product_dresciption");
        String product_producer = request.getParameter("product_producer");

        this.productBO.save(new Product(id,product_name,product_cost,product_dresciption,product_producer));
        response.sendRedirect("/product");
    }

}


