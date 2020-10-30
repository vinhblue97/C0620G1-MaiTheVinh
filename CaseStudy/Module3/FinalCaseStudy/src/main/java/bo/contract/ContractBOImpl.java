package bo.contract;

import dao.contract.ContractDAO;
import dao.contract.ContractDAOImpl;
import model.contract.Contract;

import java.util.List;

public class ContractBOImpl implements ContractBO{
    ContractDAO contractDAO = new ContractDAOImpl();
    @Override
    public List<Contract> findAll() {
        return this.contractDAO.findAll();
    }

    @Override
    public void create(Contract contract) {
        this.contractDAO.create(contract);
    }
}
