package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbInstrumentInfo;
import com.xmwjyy.wxx.pojo.TbInstrumentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInstrumentInfoMapper {
    int countByExample(TbInstrumentInfoExample example);

    int deleteByExample(TbInstrumentInfoExample example);

    int deleteByPrimaryKey(String iid);

    int insert(TbInstrumentInfo record);

    int insertSelective(TbInstrumentInfo record);

    List<TbInstrumentInfo> selectByExample(TbInstrumentInfoExample example);

    TbInstrumentInfo selectByPrimaryKey(String iid);

    int updateByExampleSelective(@Param("record") TbInstrumentInfo record, @Param("example") TbInstrumentInfoExample example);

    int updateByExample(@Param("record") TbInstrumentInfo record, @Param("example") TbInstrumentInfoExample example);

    int updateByPrimaryKeySelective(TbInstrumentInfo record);

    int updateByPrimaryKey(TbInstrumentInfo record);
}