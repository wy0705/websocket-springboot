package cn.monitor4all.demo.service;


import cn.monitor4all.demo.dao.CoursewareDao;
import cn.monitor4all.demo.entity.Courseware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursewareServiceImpl implements CoursewareService {
    @Autowired
    private CoursewareDao coursewareDao;
    @Override
    public int insertCourseware(Courseware courseware) {
        return coursewareDao.insertCourseware(courseware);
    }

    @Override
    public int deleteCourseware(int wid) {
        return coursewareDao.deleteCourseware(wid);
    }

    @Override
    public Courseware selectCourseware(int wid) {
        return coursewareDao.selectCourseware(wid);
    }
}
