package bo.contract_detail.extra_service;

import dao.contrac_detail.extra_service.ExtraServiceDAO;
import dao.contrac_detail.extra_service.ExtraServiceDAOImpl;
import model.contract_detail.ExtraService;

import java.util.List;

public class ExtraServiceBOImpl implements ExtraServiceBO {
    ExtraServiceDAO extraServiceDAO = new ExtraServiceDAOImpl();
    @Override
    public List<ExtraService> findAll() {
        return this.extraServiceDAO.findAll();
    }
}
