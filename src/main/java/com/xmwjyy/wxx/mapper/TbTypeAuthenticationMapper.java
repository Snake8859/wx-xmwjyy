package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbTypeAuthentication;
import com.xmwjyy.wxx.pojo.TbTypeAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTypeAuthenticationMapper {
    int countByExample(TbTypeAuthenticationExample example);

    int deleteByExample(TbTypeAuthenticationExample example);

    int deleteByPrimaryKey(Integer taid);

    int insert(TbTypeAuthentication record);

    int insertSelective(TbTypeAuthentication record);

    List<TbTypeAuthentication> selectByExample(TbTypeAuthenticationExample example);

    TbTypeAuthentication selectByPrimaryKey(Integer taid);

    int updateByExampleSelective(@Param("record") TbTypeAuthentication record, @Param("example") TbTypeAuthenticationExample example);

    int updateByExample(@Param("record") TbTypeAuthentication record, @Param("example") TbTypeAuthenticationExample example);

    int updateByPrimaryKeySelective(TbTypeAuthentication record);

    int updateByPrimaryKey(TbTypeAuthentication record);
}