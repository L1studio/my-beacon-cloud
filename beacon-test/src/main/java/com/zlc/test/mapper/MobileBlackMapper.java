package com.zlc.test.mapper;

import com.zlc.test.entity.MobileArea;
import com.zlc.test.entity.MobileBlack;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zjw
 * @description
 */
public interface MobileBlackMapper {

    @Select("select black_number,client_id from mobile_black where is_delete = 0")
    List<MobileBlack> findAll();

}
