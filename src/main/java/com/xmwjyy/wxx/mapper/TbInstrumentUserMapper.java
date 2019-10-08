package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbInstrumentUser;
import com.xmwjyy.wxx.pojo.TbInstrumentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInstrumentUserMapper {
    int countByExample(TbInstrumentUserExample example);

    int deleteByExample(TbInstrumentUserExample example);

    int deleteByPrimaryKey(String iuid);

    int insert(TbInstrumentUser record);

    int insertSelective(TbInstrumentUser record);

    List<TbInstrumentUser> selectByExample(TbInstrumentUserExample example);

    TbInstrumentUser selectByPrimaryKey(String iuid);

    int updateByExampleSelective(@Param("record") TbInstrumentUser record, @Param("example") TbInstrumentUserExample example);

    int updateByExample(@Param("record") TbInstrumentUser record, @Param("example") TbInstrumentUserExample example);

    int updateByPrimaryKeySelective(TbInstrumentUser record);

    int updateByPrimaryKey(TbInstrumentUser record);
}