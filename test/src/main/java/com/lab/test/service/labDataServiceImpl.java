package com.lab.test.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lab.test.Dao.DataDao;
import com.lab.test.pojo.PlatformData;
import com.lab.test.pojo.label_data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service
@Component
@Transactional
public class labDataServiceImpl implements labDataService{
    
    @Autowired
    private DataDao dd;

    @Override
    public void insertPlatformData(String select_TabName, String tableName) {
        List<label_data> label_datas = dd.selectLabel_datas(select_TabName);
        List<PlatformData.DataBean> dataBeanList = new ArrayList<>();
        PlatformData platformData = new PlatformData();
        for(int i = 0; i < label_datas.size();i++ ){
            PlatformData.DataBean dataBean = new PlatformData.DataBean();;
            String payloadStringi = label_datas.get(i).getPayload();
            dataBean.setLabel_mac(label_datas.get(i).getLabel_mac());
            dataBean.setLabel_type(label_datas.get(i).getLabel_type());
            dataBean.setCollectTime(label_datas.get(i).getDate());
            int temp_begin = payloadStringi.indexOf("temp",0)+7;
            int temp_end = payloadStringi.indexOf("power",0)-3;
            dataBean.setTemp(payloadStringi.substring(temp_begin, temp_end));
            System.out.println(payloadStringi.substring(temp_begin, temp_end));
            int humidity_begin = payloadStringi.indexOf("humidity",0)+11;
            int humidity_end = payloadStringi.indexOf("interval",0)-3;
            dataBean.setHumidity(payloadStringi.substring(humidity_begin, humidity_end));
            System.out.println(payloadStringi.substring(humidity_begin, humidity_end));
            dataBean.setTempUnit("℃");
            dataBean.setHumidityUnit("%RH");

            dataBeanList.add(dataBean);
        }
        platformData.setData(dataBeanList);
        List<PlatformData> PlatformList = new ArrayList<>();
        try {
            for(int i = 0; i < platformData.getData().size();i++){
                PlatformData platData = new PlatformData();

                platData = platDataInsert(platformData, i);

                PlatformList.add(platData);
            }
            dd.insertPlatformData(tableName, PlatformList);
        } catch (Exception e) {
            throw new RuntimeException("解析异常");
        }

    }
    public static PlatformData platDataInsert(PlatformData platformData, int i){
        PlatformData platData = new PlatformData();
        platData.setLabel_mac(platformData.getData().get(i).getLabel_mac());
        platData.setLabel_type(platformData.getData().get(i).getLabel_type());
        platData.setCollectTime(platformData.getData().get(i).getCollectTime());
        platData.setTemp(platformData.getData().get(i).getTemp());
        platData.setHumidity(platformData.getData().get(i).getHumidity());
        platData.setTempUnit(platformData.getData().get(i).getTempUnit());
        platData.setHumidityUnit(platformData.getData().get(i).getHumidityUnit());
        return platData;
    }


    
}
