package controller;

import bo.service.ServiceBO;
import bo.service.ServiceBOImpl;
import bo.service.type_of_rent.TypeOfRentBO;
import bo.service.type_of_rent.TypeOfRentBOImpl;
import model.service.House;
import model.service.Room;
import model.service.Service;
import model.service.Villa;
import model.service.type_of_rent.TypeOfRent;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {

    ServiceBO serviceBO = new ServiceBOImpl();
    TypeOfRentBO typeOfRentBO = new TypeOfRentBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createService(request, response);
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
                createForm(request, response);
                break;
            case "list":
                listService(request, response);
                break;
        }
    }

    //Function create Service
    private void createForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String service = "service";
        List<TypeOfRent> typeOfRentList = this.typeOfRentBO.findAll();
        request.setAttribute("service", service);
        request.setAttribute("typeOfRentList", typeOfRentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/createForm.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<TypeOfRent> typeOfRentList = this.typeOfRentBO.findAll();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String area = request.getParameter("area");
        String floors = request.getParameter("floors");
        String max_people = request.getParameter("max_people");
        String cost = request.getParameter("cost");
        String type_of_service_id = request.getParameter("type_of_service_id");
        String type_rent_id = request.getParameter("type_rent_id");
        String standard_room = request.getParameter("standard_room");
        String description_other_convenience = request.getParameter("description_other_convenience");
        String pool_area = request.getParameter("pool_area");
        request.setAttribute("typeOfRentList", typeOfRentList);
        String msgID = "";
        switch (type_of_service_id) {
            case "1":
                Villa villa = new Villa(id, name, area, floors, max_people, cost, type_of_service_id, type_rent_id,
                        standard_room, description_other_convenience, pool_area);
                msgID = this.serviceBO.create(villa);
                break;
            case "2":
                House house = new House(id, name, area, floors, max_people, cost, type_of_service_id, type_rent_id,
                        standard_room, description_other_convenience, pool_area);
                msgID = this.serviceBO.create(house);
                break;
            case "3":
                Room room = new Room(id, name, area, floors, max_people, cost, type_of_service_id, type_rent_id);
                msgID = this.serviceBO.create(room);
                break;
        }
        if (msgID.equals("Service ID is correct")) {
            request.setAttribute("msgID", msgID);
            RequestDispatcher dispatcher = request.getRequestDispatcher("service/createForm.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("/service?action=list");
        }

    }

    // Function List Service
    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = this.serviceBO.findAll();
        List<TypeOfRent> typeOfRentList = this.typeOfRentBO.findAll();
        request.setAttribute("typeOfRentList", typeOfRentList);
        request.setAttribute("serviceList", serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/list_service.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
