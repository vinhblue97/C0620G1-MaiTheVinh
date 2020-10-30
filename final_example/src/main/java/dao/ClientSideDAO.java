package dao;

import model.ClientSide;

import java.util.List;

public interface ClientSideDAO {

    void  create(ClientSide clientSide);

    List<ClientSide> findAll();

    List<ClientSide> find(String name, String price, String find_floor);

    String delete(String id);
}
