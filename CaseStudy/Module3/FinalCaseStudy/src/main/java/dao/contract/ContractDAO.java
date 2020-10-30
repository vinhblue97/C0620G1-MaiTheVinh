package dao.contract;

import model.contract.Contract;

import java.util.List;

public interface ContractDAO {
    List<Contract> findAll();

    void create(Contract contract);
}
