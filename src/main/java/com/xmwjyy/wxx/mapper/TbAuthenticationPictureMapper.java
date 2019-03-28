package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbAuthenticationPicture;
import com.xmwjyy.wxx.pojo.TbAuthenticationPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthenticationPictureMapper {
    int countByExample(TbAuthenticationPictureExample example);

    int deleteByExample(TbAuthenticationPictureExample example);

    int deleteByPrimaryKey(String apid);

    int insert(TbAuthenticationPicture record);

    int insertSelective(TbAuthenticationPicture record);

    List<TbAuthenticationPicture> selectByExample(TbAuthenticationPictureExample example);

    TbAuthenticationPicture selectByPrimaryKey(String apid);

    int updateByExampleSelective(@Param("record") TbAuthenticationPicture record, @Param("example") TbAuthenticationPictureExample example);

    int updateByExample(@Param("record") TbAuthenticationPicture record, @Param("example") TbAuthenticationPictureExample example);

    int updateByPrimaryKeySelective(TbAuthenticationPicture record);

    int updateByPrimaryKey(TbAuthenticationPicture record);
}