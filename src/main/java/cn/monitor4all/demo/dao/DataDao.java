package cn.monitor4all.demo.dao;


import cn.monitor4all.demo.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DataDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int deleteData(int did){
        return jdbcTemplate.update("delete from data where did=?",did);
    }

    public UserData selectBydid(int did){
        final UserData data=new UserData();
        String sql= "SELECT * FROM data WHERE did=?";
        jdbcTemplate.query(sql, new Object[]{did}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                data.setDid(rs.getInt(1));
                data.setAge(rs.getInt(2));
                data.setGender(rs.getString(3));
            }
        });
        return data;
    }

    public int insertData(UserData data){
        return jdbcTemplate.update("insert into data(did,age,gender)values (?,?,?)",data.getDid(),data.getAge(),data.getGender());
    }

    public int Update(UserData data){
        return jdbcTemplate.update("UPDATE data SET did=?,age=?,gender=? WHERE did=?",data.getDid(),data.getAge(),data.getGender(),data.getDid());
    }
}
