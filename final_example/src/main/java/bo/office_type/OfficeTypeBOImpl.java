package bo.office_type;

import dao.office_type.OfficeTypeDAO;
import dao.office_type.OfficeTypeDAOImpl;
import model.OfficeType;

import java.util.List;

public class OfficeTypeBOImpl implements OfficeTypeBO {
    OfficeTypeDAO officeTypeDAO = new OfficeTypeDAOImpl();
    @Override
    public List<OfficeType> findAll() {
        return this.officeTypeDAO.findAll();
    }
}
