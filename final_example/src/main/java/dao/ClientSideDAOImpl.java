package dao;

import common.BaseDAO;
import model.ClientSide;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientSideDAOImpl implements ClientSideDAO {
    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public void create(ClientSide clientSide) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into rent_area(id, area, status_id, " +
                    "floors, office_type_id, price, begin_date, end_date)" +
                    "value(?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1, clientSide.getAreaId());
            preparedStatement.setString(2, clientSide.getArea());
            preparedStatement.setString(3, clientSide.getStatus());
            preparedStatement.setString(4, clientSide.getFloors());
            preparedStatement.setString(5, clientSide.getOfficeType());
            preparedStatement.setString(6, clientSide.getRentPrice());
            preparedStatement.setString(7, clientSide.getBeginDate());
            preparedStatement.setString(8, clientSide.getEndDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ClientSide> findAll() {
        List<ClientSide> clientSideList = new ArrayList<>();
        try {
            ClientSide.counter = 1;
            PreparedStatement preparedStatement = connection.prepareStatement("select * from rent_area order by area;");
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
    public List<ClientSide> find(String type_area, String price, String floor) {
        List<ClientSide> clientSideList = new ArrayList<>();
        try {
            if (!type_area.equals("") && !price.equals("") && !floor.equals("")) {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from rent_area " +
                        "where office_type_id like concat('%',?,'%') and price like concat('%',?,'%') and floors like concat('%',?,'%')");
                preparedStatement.setString(1, type_area);
                preparedStatement.setString(2, price);
                preparedStatement.setString(3, floor);
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
            } else if (!type_area.equals("")) {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from rent_area " +
                        "where office_type_id like concat('%',?,'%')");
                preparedStatement.setString(1, type_area);
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
            } else if (!price.equals("")) {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from " +
                        "rent_area where price like concat('%',?,'%')");
                preparedStatement.setString(1, price);
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
            } else if (!floor.equals("")) {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from rent_area where floors like concat('%',?,'%')");
                preparedStatement.setString(1, floor);
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientSideList;
    }

    @Override
    public String delete(String id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from rent_area where id = ?;");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
