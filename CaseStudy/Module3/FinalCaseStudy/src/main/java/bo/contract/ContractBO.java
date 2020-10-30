package bo.contract;

import model.contract.Contract;

import java.util.List;

public interface ContractBO {
    List<Contract> findAll();

    void create(Contract contract);
}
