package bo.service.type_of_rent;

import dao.service.type_of_rent.TypeOfRentDAO;
import dao.service.type_of_rent.TypeOfRentDAOImpl;
import model.service.type_of_rent.TypeOfRent;

import java.util.List;

public class TypeOfRentBOImpl implements TypeOfRentBO {

    TypeOfRentDAO typeOfServiceDAO = new TypeOfRentDAOImpl();
    @Override
    public List<TypeOfRent> findAll() {
        return this.typeOfServiceDAO.findAll();
    }
}
