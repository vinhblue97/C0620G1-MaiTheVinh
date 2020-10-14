package bo;

import model.ClientSide;

import java.util.List;

public interface ClientSideBO {

    void create(ClientSide clientSide);

    List<ClientSide> findAll();

    List<ClientSide> find(String name, String price);

    String delete(String id);
}
