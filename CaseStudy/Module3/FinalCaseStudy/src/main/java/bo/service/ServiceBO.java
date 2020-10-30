package bo.service;

import model.service.House;
import model.service.Room;
import model.service.Service;
import model.service.Villa;

import java.util.List;

public interface ServiceBO {

    List<Service> findAll();

    String create(Villa villa);

    String create(House house);

    String create(Room room);


}
