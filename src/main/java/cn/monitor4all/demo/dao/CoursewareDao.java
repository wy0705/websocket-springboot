package cn.monitor4all.demo.dao;


import cn.monitor4all.demo.entity.Courseware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CoursewareDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertCourseware(Courseware courseware){
        return jdbcTemplate.update("insert into courseware(pdfpath,pfpath,timecode,mupath,timestart)values (?,?,?,?,?)",courseware.getPdfpath(),courseware.getPfpath(),courseware.getTimecode(),courseware.getMupath(),courseware.getTimestart());
    }

    public int deleteCourseware(int wid){
        return jdbcTemplate.update("delete from courseware where wid=?",wid);
    }

    public Courseware selectCourseware(int wid){
        final Courseware courseware=new Courseware();
        String sql="select * from courseware where wid=?";
        jdbcTemplate.query(sql, new Object[]{wid}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                courseware.setPdfpath(rs.getString(1));
                courseware.setPfpath(rs.getString(2));
                courseware.setTimecode(rs.getString(3));
                courseware.setMupath(rs.getString(4));
                courseware.setTimestart(rs.getString(5));
            }
        });
        return courseware;
    }
}
