package cn.xuchenbing.teac.mapper;

import cn.xuchenbing.teac.entity.Education;
import cn.xuchenbing.teac.entity.EducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper {
    int countByExample(EducationExample example);

    int deleteByExample(EducationExample example);

    int deleteByPrimaryKey(String educationId);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(String educationId);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}