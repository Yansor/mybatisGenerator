package com.efivestar.wxgw.mapper.cms;

import com.efivestar.wxgw.domain.cms.Navigator;

public interface NavigatorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Navigator record);

    int insertSelective(Navigator record);

    Navigator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Navigator record);

    int updateByPrimaryKey(Navigator record);
}