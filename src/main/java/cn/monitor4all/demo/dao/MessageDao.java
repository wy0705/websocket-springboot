package cn.monitor4all.demo.dao;


import cn.monitor4all.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MessageDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int deleteMessage(int mid){
        return jdbcTemplate.update("delete from message where mid=?",mid);
    }

    public int insertMessage(Message message){
        return jdbcTemplate.update("insert into message(mid,fid,content,timestamps,renamee)values (?,?,?,?,?)",message.getMid(),message.getFid(),message.getContent(),message.getTimestamps(),message.getRenamee());
    }

    public List<Integer> selectMessageByfid(int fid){
        final List<Integer> mmlist=new ArrayList<>();
        String sql= "SELECT mid FROM message WHERE fid=?";
        jdbcTemplate.query(sql, new Object[]{fid}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                mmlist.add(rs.getInt(1));
            }
        });
        return mmlist;
    }

}
