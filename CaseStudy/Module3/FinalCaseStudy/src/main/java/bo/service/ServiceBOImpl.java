package bo.service;

import common.Validate;
import dao.service.ServiceDAO;
import dao.service.ServiceDAOImpl;
import model.service.House;
import model.service.Room;
import model.service.Service;
import model.service.Villa;

import java.util.List;

public class ServiceBOImpl implements ServiceBO {

    ServiceDAO serviceDAO = new ServiceDAOImpl();

    @Override
    public List<Service> findAll() {
        return this.serviceDAO.findAll();
    }

    @Override
    public String create(Villa villa) {
        String msg = "Service ID is not correct form";
        if (Validate.valiedateSericeID(villa.getId()).equals("OK")) {
            this.serviceDAO.create(villa);
            msg = "Service ID is correct";
        }
        return msg;
    }

    @Override
    public String create(House house) {
        String msg = "Service ID is not correct form";
        if (Validate.valiedateSericeID(house.getId()).equals("OK")) {
            this.serviceDAO.create(house);
            msg = "Service ID is correct";
        }
        return msg;
    }

    @Override
    public String create(Room room) {
        String msg = "Service ID is not correct form";
        if (Validate.valiedateSericeID(room.getId()).equals("OK")) {
            this.serviceDAO.create(room);
            msg = "Service ID is correct";
        }
        return msg;
    }
}
