package bo.customer.type_of_customers;

import dao.customer.type_of_customers.TypeOfCustomerDAO;
import dao.customer.type_of_customers.TypeOfCustomerDAOImpl;
import model.customer.TypeOfCustomer;

import java.util.List;

public class TypeOfCustomerBOImpl implements TypeOfCustomerBO{
    TypeOfCustomerDAO typeOfCustomerDAO = new TypeOfCustomerDAOImpl();
    @Override
    public List<TypeOfCustomer> findAll() {
        return this.typeOfCustomerDAO.findAll();
    }
}
