package cn.xuchenbing.teac.mapper;

import cn.xuchenbing.teac.entity.TeacherNavbar;
import cn.xuchenbing.teac.entity.TeacherNavbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherNavbarMapper {
    int countByExample(TeacherNavbarExample example);

    int deleteByExample(TeacherNavbarExample example);

    int deleteByPrimaryKey(String teacNavId);

    int insert(TeacherNavbar record);

    int insertSelective(TeacherNavbar record);

    List<TeacherNavbar> selectByExample(TeacherNavbarExample example);

    TeacherNavbar selectByPrimaryKey(String teacNavId);

    int updateByExampleSelective(@Param("record") TeacherNavbar record, @Param("example") TeacherNavbarExample example);

    int updateByExample(@Param("record") TeacherNavbar record, @Param("example") TeacherNavbarExample example);

    int updateByPrimaryKeySelective(TeacherNavbar record);

    int updateByPrimaryKey(TeacherNavbar record);
}