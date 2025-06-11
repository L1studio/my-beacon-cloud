package com.zlc.test.mapper;

import com.zlc.test.entity.MobileArea;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zjw
 * @description
 */
public interface MobileDirtyWordMapper {

    @Select("select dirtyword from mobile_dirtyword")
    List<String> findDirtyWord();

}
