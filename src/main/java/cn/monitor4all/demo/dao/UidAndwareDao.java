package cn.monitor4all.demo.dao;

import cn.monitor4all.demo.entity.UidAndware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UidAndwareDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertuidAndware(UidAndware uaw){
        return jdbcTemplate.update("insert into uidAndware(uwid,uid,wid)values (?,?,?)",uaw.getUwid(),uaw.getUid(),uaw.getWid());
    }


    public int deleteuidAndware(int uwid){
        return jdbcTemplate.update("delete from uidAndware where uwid=?",uwid);
    }

    public List<Integer> selelctuidAndware(int uid){
        final List<Integer> uwlist=new ArrayList<>();
        String sql="select wid from uidAndware where uid=?";
        jdbcTemplate.query(sql, new Object[]{uid}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                uwlist.add(rs.getInt(1));
            }
        });
        return uwlist;
    }
}
