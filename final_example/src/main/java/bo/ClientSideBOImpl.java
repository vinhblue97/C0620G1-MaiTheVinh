package bo;

import dao.ClientSideDAO;
import dao.ClientSideDAOImpl;
import model.ClientSide;

import java.util.List;

public class ClientSideBOImpl implements ClientSideBO {
    ClientSideDAO clientSideDao = new ClientSideDAOImpl();

    @Override
    public void create(ClientSide clientSide) {
        this.clientSideDao.create(clientSide);
    }

    @Override
    public List<ClientSide> findAll() {
        return this.clientSideDao.findAll();
    }

    @Override
    public List<ClientSide> find(String name, String price, String find_floor) {
        return this.clientSideDao.find(name, price, find_floor);
    }


    @Override
    public String delete(String id) {
        this.clientSideDao.delete(id);
        return "null";
    }
}
