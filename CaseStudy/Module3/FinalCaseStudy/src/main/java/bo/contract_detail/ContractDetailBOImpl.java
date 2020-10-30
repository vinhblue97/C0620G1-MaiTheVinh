package bo.contract_detail;

import dao.contrac_detail.ContractDetailDAO;
import dao.contrac_detail.ContractDetailDAOImpl;
import model.contract_detail.ContractDetail;

import java.util.List;

public class ContractDetailBOImpl implements ContractDetailBO {
    ContractDetailDAO contractDetailDAO = new ContractDetailDAOImpl();
    @Override
    public List<ContractDetail> findAll() {
        return this.contractDetailDAO.findAll();
    }
}
