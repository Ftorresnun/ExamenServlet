package repository;
import models.stats;
import connection.*;

import java.util.*;
import java.sql.*;

public class statsRepository {

    private final AbstractConnection manager = new H2Connection();

    public List<stats> findAll() {
        Connection conn = manager.open();
        PreparedStatement statement = null;
        List<stats> statsList = new ArrayList<>();
        ResultSet rs = null;

        try{
            statement = conn.prepareStatement("select * from champion_stats");
            rs = statement.executeQuery();

            statsRepository statsRepo = new statsRepository();

            while (rs.next()) {
                stats s = new stats();
                s.setChampion(rs.getInt("champion"));
                s.setStat_name(rs.getString("stat_name"));
                s.setStat_value(rs.getFloat("stat_value"));
                s.setModifier_per_level(rs.getFloat("modifier_per_level"));
                statsList.add(s);
            }
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            manager.close(rs);
            manager.close(statement);
            manager.close(conn);
        }
        return  statsList;
    }

    public void insertOne(stats s) {
        Connection conn = manager.open();
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement("INSERT INTO stats(champion, stat_name, stat_value, modifier_per_level) VALUES (?, ?, ?, ?)");
            statement.setInt(1, s.getChampion());
            statement.setString(2, s.getStat_name());
            statement.setFloat(3, s.getStat_value());
            statement.setFloat(4, s.getModifier_per_level());
            statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            manager.close(statement);
            manager.close(conn);
        }
    }
}
