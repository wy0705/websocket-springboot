package cn.monitor4all.demo.service;


import cn.monitor4all.demo.entity.Courseware;

public interface CoursewareService {
    int insertCourseware(Courseware courseware);
    int deleteCourseware(int wid);
    Courseware selectCourseware(int wid);
}
