package bo.employee.position;

import dao.employee.position.PositionDAO;
import dao.employee.position.PositionDAOImpl;
import model.employee.Position;

import java.util.List;

public class PositionBOImpl implements PositionBO{

    PositionDAO positionDAO = new PositionDAOImpl();
    @Override
    public List<Position> findAll() {
        return this.positionDAO.findAll();
    }
}
