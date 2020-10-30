package bo.employee.level;

import dao.employee.level.LevelDAO;
import dao.employee.level.LevelDAOImpl;
import model.employee.Level;

import java.util.List;

public class LevelBOImpl implements LevelBO {
    LevelDAO levelDAO = new LevelDAOImpl();
    @Override
    public List<Level> findAll() {
        return this.levelDAO.findAll();
    }
}
