package com.zlc.test.mapper;

import com.zlc.test.entity.ClientBalance;
import com.zlc.test.entity.MobileArea;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zjw
 * @description
 */
public interface MobileAreaMapper {

    @Select("select mobile_number,mobile_area,mobile_type from mobile_area")
    List<MobileArea> findAll();

}
