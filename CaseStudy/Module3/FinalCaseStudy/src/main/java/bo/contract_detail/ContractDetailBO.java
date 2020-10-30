package bo.contract_detail;

import model.contract_detail.ContractDetail;

import java.util.List;

public interface ContractDetailBO {
    List<ContractDetail> findAll();
}
