package cn.xuchenbing.teac.mapper;

import cn.xuchenbing.teac.entity.Profession;
import cn.xuchenbing.teac.entity.ProfessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionMapper {
    int countByExample(ProfessionExample example);

    int deleteByExample(ProfessionExample example);

    int deleteByPrimaryKey(String professionId);

    int insert(Profession record);

    int insertSelective(Profession record);

    List<Profession> selectByExampleWithBLOBs(ProfessionExample example);

    List<Profession> selectByExample(ProfessionExample example);

    Profession selectByPrimaryKey(String professionId);

    int updateByExampleSelective(@Param("record") Profession record, @Param("example") ProfessionExample example);

    int updateByExampleWithBLOBs(@Param("record") Profession record, @Param("example") ProfessionExample example);

    int updateByExample(@Param("record") Profession record, @Param("example") ProfessionExample example);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKeyWithBLOBs(Profession record);

    int updateByPrimaryKey(Profession record);
}