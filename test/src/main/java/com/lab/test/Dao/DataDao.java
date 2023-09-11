package com.lab.test.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lab.test.pojo.PlatformData;
import com.lab.test.pojo.label_data;

@Mapper
public interface DataDao {
    public List<label_data> selectLabel_datas(@Param("select_TabName") String select_TabName);
    public void insertPlatformData(@Param("tableName") String tableName,@Param("PlatformData") List<PlatformData> PlatformData);
}
