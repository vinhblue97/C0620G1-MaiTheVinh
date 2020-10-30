package dao.service;

import model.service.House;
import model.service.Room;
import model.service.Service;
import model.service.Villa;

import java.util.List;

public interface ServiceDAO {

    List<Service> findAll();

    void create(Villa villa);

    void create(House house);

    void create(Room room);
}
