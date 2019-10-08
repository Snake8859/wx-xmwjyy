package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.CustomInstrument;
import com.xmwjyy.wxx.pojo.TbInstrument;
import com.xmwjyy.wxx.pojo.TbInstrumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInstrumentMapper {
    int countByExample(TbInstrumentExample example);

    int deleteByExample(TbInstrumentExample example);

    int deleteByPrimaryKey(String iid);

    int insert(TbInstrument record);

    int insertSelective(TbInstrument record);

    List<TbInstrument> selectByExample(TbInstrumentExample example);

    TbInstrument selectByPrimaryKey(String iid);

    int updateByExampleSelective(@Param("record") TbInstrument record, @Param("example") TbInstrumentExample example);

    int updateByExample(@Param("record") TbInstrument record, @Param("example") TbInstrumentExample example);

    int updateByPrimaryKeySelective(TbInstrument record);

    int updateByPrimaryKey(TbInstrument record);
    
    
}