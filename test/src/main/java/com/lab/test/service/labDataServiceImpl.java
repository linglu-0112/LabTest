package com.lab.test.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
            for(int j = 0 ; j < 2; j++){
                if(j==0){
                    PlatformData.DataBean dataBean = new PlatformData.DataBean();;
                    String payloadStringi = label_datas.get(i).getPayload();
                    dataBean.setLabel_mac(label_datas.get(i).getLabel_mac());
                    dataBean.setLabel_type(label_datas.get(i).getLabel_type());
                    dataBean.setTimestamps(label_datas.get(i).getDate());
                    dataBean.setCnName("温度");
                    dataBean.setSensorPhysicalId("33");
                    dataBean.setUnits("℃");
                    int temp_begin = payloadStringi.indexOf("temp",0)+7;
                    int temp_end = payloadStringi.indexOf("power",0)-3;
                    dataBean.setSensorPhysicalValue(payloadStringi.substring(temp_begin, temp_end));
                    dataBeanList.add(dataBean);
                }else{
                    PlatformData.DataBean dataBean = new PlatformData.DataBean();;
                    String payloadStringi = label_datas.get(i).getPayload();
                    dataBean.setLabel_mac(label_datas.get(i).getLabel_mac());
                    dataBean.setLabel_type(label_datas.get(i).getLabel_type());
                    dataBean.setTimestamps(label_datas.get(i).getDate());
                    dataBean.setCnName("湿度");
                    dataBean.setSensorPhysicalId("32");
                    dataBean.setUnits("%RH");
                    int humidity_begin = payloadStringi.indexOf("humidity",0)+11;
                    int humidity_end = payloadStringi.indexOf("interval",0)-3;
                    dataBean.setSensorPhysicalValue(payloadStringi.substring(humidity_begin, humidity_end));
                    dataBeanList.add(dataBean);
                }
            }
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
        platData.setTimestamps(platformData.getData().get(i).getTimestamps());
        platData.setCnName(platformData.getData().get(i).getCnName());
        platData.setSensorPhysicalId(platformData.getData().get(i).getSensorPhysicalId());
        platData.setUnits(platformData.getData().get(i).getUnits());
        platData.setSensorPhysicalValue(platformData.getData().get(i).getSensorPhysicalValue());
        return platData;
    }
    

    
}
