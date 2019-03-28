package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbUserCollection;
import com.xmwjyy.wxx.pojo.TbUserCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCollectionMapper {
    int countByExample(TbUserCollectionExample example);

    int deleteByExample(TbUserCollectionExample example);

    int deleteByPrimaryKey(String ucid);

    int insert(TbUserCollection record);

    int insertSelective(TbUserCollection record);

    List<TbUserCollection> selectByExample(TbUserCollectionExample example);

    TbUserCollection selectByPrimaryKey(String ucid);

    int updateByExampleSelective(@Param("record") TbUserCollection record, @Param("example") TbUserCollectionExample example);

    int updateByExample(@Param("record") TbUserCollection record, @Param("example") TbUserCollectionExample example);

    int updateByPrimaryKeySelective(TbUserCollection record);

    int updateByPrimaryKey(TbUserCollection record);
}