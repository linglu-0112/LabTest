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
    public void insertPlatformData(String select_TabName) {
        System.out.println(select_TabName);
        List<label_data> label_datas = dd.selectLabel_datas(select_TabName);
        List<PlatformData.DataBean> dataBeans = new ArrayList<>();
        
        System.out.println("label_datas.size() = " + label_datas.size());
        System.out.println(label_datas.get(0).getLabel_mac());
        System.out.println(label_datas.get(0).getPayload());
    }
    
}
