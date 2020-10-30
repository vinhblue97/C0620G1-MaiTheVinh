package bo.employee.office;

import dao.employee.office.OfficeDAO;
import dao.employee.office.OfficeDAOImpl;
import model.employee.Office;

import java.util.List;

public class OfficeBOImpl implements OfficeBO {

    OfficeDAO officeDAO = new OfficeDAOImpl();
    @Override
    public List<Office> findAll() {
        return this.officeDAO.findAll();
    }
}
