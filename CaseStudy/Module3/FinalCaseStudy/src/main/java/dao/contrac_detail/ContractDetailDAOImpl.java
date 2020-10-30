package dao.contrac_detail;

import common.BaseDAO;
import model.contract_detail.ContractDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailDAOImpl implements ContractDetailDAO {
    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<ContractDetail> findAll() {
        List<ContractDetail> contractDetailList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select contract_id, extra_service_id from contract_detail;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String contract_id = resultSet.getString("contract_id");
                String extra_service_id = resultSet.getString("extra_service_id");
                ContractDetail contractDetail = new ContractDetail(contract_id,extra_service_id);
                contractDetailList.add(contractDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractDetailList;
    }
}
