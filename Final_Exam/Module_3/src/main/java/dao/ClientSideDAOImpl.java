package dao;

import common.BaseDAO;
import model.ClientSide;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientSideDAOImpl implements ClientSideDAO {
    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public void create(ClientSide clientSide) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into product(id, `name`, price, " +
//                    "quantity, color, `description`, category_id)" +
//                    "value(?,?,?,?,?,?,?);");
//            preparedStatement.setString(1, clientSide.getAreaId());
//            preparedStatement.setString(2, clientSide.getArea());
//            preparedStatement.setString(3, clientSide.getStatus());
//            preparedStatement.setString(4, clientSide.getFloors());
//            preparedStatement.setString(5, clientSide.getOfficeType());
//            preparedStatement.setString(6, clientSide.getDescription());
//            preparedStatement.setString(7, clientSide.getRentPrice());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public List<ClientSide> findAll() {
        List<ClientSide> clientSideList = new ArrayList<>();
        try {
            ClientSide.counter = 1;
            PreparedStatement preparedStatement = connection.prepareStatement("select * from rent_area;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String areaId = resultSet.getString("id");
                String area = resultSet.getString("area");
                String status = resultSet.getString("status_id");
                String floors = resultSet.getString("floors");
                String officeType = resultSet.getString("office_type_id");
                String description = resultSet.getString("description");
                String rentPrice = resultSet.getString("price");
                String beginDate = resultSet.getString("begin_date");
                String endDate = resultSet.getString("end_date");
                ClientSide clientSide = new ClientSide(areaId, area, status, floors, officeType, description, rentPrice, beginDate, endDate);
                clientSideList.add(clientSide);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientSideList;
    }

    @Override
    public List<ClientSide> find(String name, String price) {
//        List<ClientSide> clientSideList = new ArrayList<>();
//        try {
//            if (!name.equals("") && !price.equals("")) {
//                PreparedStatement preparedStatement = connection.prepareStatement("select * from product where `name` like ? & price like ?");
//                preparedStatement.setString(1, name);
//                preparedStatement.setString(2, price);
//                ResultSet resultSet = preparedStatement.executeQuery();
//                while (resultSet.next()) {
//                    String areaId = resultSet.getString("id");
//                    String status = resultSet.getString("status_id");
//                    String area = resultSet.getString("area");
//                    String floors = resultSet.getString("floors");
//                    String officeType = resultSet.getString("office_type_id");
//                    String description = resultSet.getString("description");
//                    String rentPrice = resultSet.getString("price");
//                    String beginDate = resultSet.getString("begin_date");
//                    String endDate = resultSet.getString("end_date");
//                    ClientSide clientSide = new ClientSide(areaId, area, status, floors, officeType, description, rentPrice, beginDate, endDate);
//                    clientSideList.add(clientSide);
//                }
//            } else if (!name.equals("")) {
//                PreparedStatement preparedStatement = connection.prepareStatement("select * from product where `name` like concat('%',?,'%')");
//                preparedStatement.setString(1, name);
//                ResultSet resultSet = preparedStatement.executeQuery();
//                while (resultSet.next()) {
//                    String areaId = resultSet.getString("id");
//                    String status = resultSet.getString("status_id");
//                    String area = resultSet.getString("area");
//                    String floors = resultSet.getString("floors");
//                    String officeType = resultSet.getString("office_type_id");
//                    String description = resultSet.getString("description");
//                    String rentPrice = resultSet.getString("price");
//                    String beginDate = resultSet.getString("begin_date");
//                    String endDate = resultSet.getString("end_date");
//                    ClientSide clientSide = new ClientSide(areaId, area, status, floors, officeType, description, rentPrice, beginDate, endDate);
//                    clientSideList.add(clientSide);
//                }
//            } else if (!price.equals("")) {
//                PreparedStatement preparedStatement = connection.prepareStatement("select * from product where price like concat('%',?,'%')");
//                preparedStatement.setString(1, price);
//                ResultSet resultSet = preparedStatement.executeQuery();
//                while (resultSet.next()) {
//                    String areaId = resultSet.getString("id");
//                    String status = resultSet.getString("status_id");
//                    String area = resultSet.getString("area");
//                    String floors = resultSet.getString("floors");
//                    String officeType = resultSet.getString("office_type_id");
//                    String description = resultSet.getString("description");
//                    String rentPrice = resultSet.getString("price");
//                    String beginDate = resultSet.getString("begin_date");
//                    String endDate = resultSet.getString("end_date");
//                    ClientSide clientSide = new ClientSide(areaId, area, status, floors, officeType, description, rentPrice, beginDate, endDate);
//                    clientSideList.add(clientSide);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    @Override
    public String delete(String id) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("delete from exam_table where id = ?;");
//            preparedStatement.setString(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
