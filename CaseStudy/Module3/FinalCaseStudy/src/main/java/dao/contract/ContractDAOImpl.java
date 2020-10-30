package dao.contract;

import common.BaseDAO;
import model.contract.Contract;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractDAOImpl implements ContractDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<Contract> findAll() {
        List<Contract> contractList = new ArrayList<>();
        try {
            Contract.counter = 1;
            CallableStatement callableStatement = connection.prepareCall("call contract_map()");
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String employee = resultSet.getString("employee");
                String customer = resultSet.getString("customer");
                String service= resultSet.getString("service");
                String begin_date = resultSet.getString("begin_date");
                String end_date = resultSet.getString("end_date");
                String deposists = resultSet.getString("deposists");
                String total_cost = resultSet.getString("service");
                Contract contract = new Contract(id, employee, customer, service, begin_date, end_date, deposists, total_cost);
                contractList.add(contract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractList;
    }

    @Override
    public void create(Contract contract) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call create_contract(?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, contract.getId());
            callableStatement.setString(2, contract.getEmployee());
            callableStatement.setString(3, contract.getCustomer());
            callableStatement.setString(4, contract.getService());
            callableStatement.setString(5, contract.getBegin_date());
            callableStatement.setString(6, contract.getEnd_date());
            callableStatement.setString(7, contract.getDeposists());
            callableStatement.setString(8, contract.getTotal_cost());
            int resultSet = callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
