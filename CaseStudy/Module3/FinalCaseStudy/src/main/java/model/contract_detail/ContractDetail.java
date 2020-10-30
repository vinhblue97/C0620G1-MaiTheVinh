package model.contract_detail;

public class ContractDetail {
    private String contract_id;
    private String extra_service_id;

    public String getContract_id() {
        return contract_id;
    }

    public String getExtra_service_id() {
        return extra_service_id;
    }

    public ContractDetail(String contract_id, String extra_service_id) {
        this.contract_id = contract_id;
        this.extra_service_id = extra_service_id;
    }
}
