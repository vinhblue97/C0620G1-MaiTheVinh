package dao.service;

import common.BaseDAO;
import model.service.House;
import model.service.Room;
import model.service.Service;
import model.service.Villa;
import org.omg.CORBA.portable.ServantObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAOImpl implements ServiceDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<Service> findAll() {
        List<Service> serviceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name`, area, floors, " +
                    "max_people, cost, type_of_service_id, type_rent_id, standard_room, pool_area, service_status from services");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String area = resultSet.getString("area");
                String floors = resultSet.getString("floors");
                String max_people = resultSet.getString("max_people");
                String cost = resultSet.getString("cost");
                String type_of_service_id = resultSet.getString("type_of_service_id");
                String type_rent_id = resultSet.getString("type_rent_id");
                String standard_room = resultSet.getString("standard_room");
                String pool_area = resultSet.getString("pool_area");
                String service_status = resultSet.getString("service_status");

                switch (type_of_service_id) {
                    case "1":
                        Service villa = new Villa(id, name, area, floors, max_people, cost, type_of_service_id,
                                type_rent_id, standard_room, service_status, pool_area);
                        serviceList.add(villa);
                        break;
                    case "2":
                        Service house = new House(id, name, area, floors, max_people, cost, type_of_service_id,
                                type_rent_id, standard_room, service_status, pool_area);
                        serviceList.add(house);
                        break;
                    case "3":
                        Service room = new Room(id, name, area, floors, max_people, cost, type_of_service_id, type_rent_id);
                        serviceList.add(room);
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public void create(Villa villa) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call create_service(?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, villa.getId());
            callableStatement.setString(2, villa.getName());
            callableStatement.setString(3, villa.getArea());
            callableStatement.setString(4, villa.getFloor());
            callableStatement.setString(5, villa.getMax_people());
            callableStatement.setString(6, villa.getCost());
            callableStatement.setString(7, villa.getType_of_service_id());
            callableStatement.setString(8, villa.getType_rent_id());
            callableStatement.setString(9, villa.getDescription_other_convenience());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(House house) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call create_service(?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, house.getId());
            callableStatement.setString(2, house.getName());
            callableStatement.setString(3, house.getArea());
            callableStatement.setString(4, house.getFloor());
            callableStatement.setString(5, house.getMax_people());
            callableStatement.setString(6, house.getCost());
            callableStatement.setString(7, house.getType_of_service_id());
            callableStatement.setString(8, house.getType_rent_id());
            callableStatement.setString(9, house.getDescription_other_convenience());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(Room room) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call create_service(?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, room.getId());
            callableStatement.setString(2, room.getName());
            callableStatement.setString(3, room.getArea());
            callableStatement.setString(4, room.getFloor());
            callableStatement.setString(5, room.getMax_people());
            callableStatement.setString(6, room.getCost());
            callableStatement.setString(7, room.getType_of_service_id());
            callableStatement.setString(8, room.getType_rent_id());
            callableStatement.setString(9, null);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
