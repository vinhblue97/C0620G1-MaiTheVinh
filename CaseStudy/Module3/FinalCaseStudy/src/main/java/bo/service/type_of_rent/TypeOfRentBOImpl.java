package bo.service.type_of_service;

import bo.customer.type_of_customers.TypeOfCustomerBO;
import dao.service.type_of_service.TypeOfServiceDAO;
import dao.service.type_of_service.TypeOfServiceDAOImpl;
import model.customer.TypeOfCustomer;
import model.service.type_of_service.TypeOfService;

import java.util.List;

public class TypeOfServiceBOImpl implements TypeOfServiceBO {

    TypeOfServiceDAO typeOfServiceDAO = new TypeOfServiceDAOImpl();
    @Override
    public List<TypeOfService> findAll() {
        return this.typeOfServiceDAO.findAll();
    }
}
