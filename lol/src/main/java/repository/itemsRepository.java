package repository;
import models.items;
import connection.*;

import java.util.*;
import java.sql.*;

public class itemsRepository {

    private final AbstractConnection manager = new H2Connection();

    public List<items> findAll() {
        Connection conn = manager.open();
        PreparedStatement statement = null;
        List<items> itemsList = new ArrayList<>();
        ResultSet rs = null;

        try{
            statement = conn.prepareStatement("select * from items");
            rs = statement.executeQuery();

            itemsRepository itemsRepo = new itemsRepository();

            while (rs.next()) {
                items i = new items();
                i.setId(rs.getInt("id"));
                i.setItem_name(rs.getString("item_name"));
                i.setEffect(rs.getString("effect"));
                itemsList.add(i);
            }
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            manager.close(rs);
            manager.close(statement);
            manager.close(conn);
        }
        return  itemsList;
    }

    public void insertOne(items i) {
        Connection conn = manager.open();
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement("INSERT INTO items(id, item_name, effect) VALUES (?, ?, ?)");
            statement.setInt(1, i.getId());
            statement.setString(2, i.getItem_name());
            statement.setString(3, i.getEffect());
            statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            manager.close(statement);
            manager.close(conn);
        }
    }
    
    public void insert(items i) {
		Connection conn = manager.open();
		PreparedStatement preparedStatement = null;
		int id = getLastIdItem();
		id++;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO items (id,item_name,effect) VALUES (?, ?, ?)");
			preparedStatement.setInt(1, i.getId());
			preparedStatement.setString(2, i.getItem_name());
			preparedStatement.setString(3, i.getEffect());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
	}
    //recoge el ultimo id y lo añade
    public int getLastIdItem() {
		int last_id = 0;
		Connection conn = manager.open();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn.prepareStatement("SELECT max(id) as id FROM items");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				last_id = resultSet.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return last_id;
	}
}
