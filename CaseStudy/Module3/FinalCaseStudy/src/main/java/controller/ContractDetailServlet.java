package controller;

import bo.contract.ContractBO;
import bo.contract.ContractBOImpl;
import bo.contract_detail.ContractDetailBO;
import bo.contract_detail.ContractDetailBOImpl;
import bo.contract_detail.extra_service.ExtraServiceBO;
import bo.contract_detail.extra_service.ExtraServiceBOImpl;
import model.contract.Contract;
import model.contract_detail.ContractDetail;
import model.contract_detail.ExtraService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractDetailServlet", urlPatterns = "/contract_detail")
public class ContractDetailServlet extends HttpServlet {

    ExtraServiceBO extraServiceBO = new ExtraServiceBOImpl();
    ContractDetailBO contractDetailBO = new ContractDetailBOImpl();
    ContractBO contractBO = new ContractBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "list":
                break;
            case "create":
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "list":
                listContractDetail(request, response);
                break;
            case "create":
                break;
        }
    }

    private void listContractDetail(HttpServletRequest request, HttpServletResponse response) {
        List<ExtraService> extraServiceList = this.extraServiceBO.findAll();
        List<ContractDetail> contractDetailList = this.contractDetailBO.findAll();
        request.setAttribute("extraServiceList", extraServiceList);
        request.setAttribute("contractDetailList", contractDetailList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract_detail/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
