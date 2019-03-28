package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbTechnicalCase;
import com.xmwjyy.wxx.pojo.TbTechnicalCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTechnicalCaseMapper {
    int countByExample(TbTechnicalCaseExample example);

    int deleteByExample(TbTechnicalCaseExample example);

    int deleteByPrimaryKey(Long caseid);

    int insert(TbTechnicalCase record);

    int insertSelective(TbTechnicalCase record);

    List<TbTechnicalCase> selectByExample(TbTechnicalCaseExample example);

    TbTechnicalCase selectByPrimaryKey(Long caseid);

    int updateByExampleSelective(@Param("record") TbTechnicalCase record, @Param("example") TbTechnicalCaseExample example);

    int updateByExample(@Param("record") TbTechnicalCase record, @Param("example") TbTechnicalCaseExample example);

    int updateByPrimaryKeySelective(TbTechnicalCase record);

    int updateByPrimaryKey(TbTechnicalCase record);
}