package dao.contrac_detail;

import model.contract_detail.ContractDetail;

import java.util.List;

public interface ContractDetailDAO {
    List<ContractDetail> findAll();
}
