package com.lab.test.pojo;
import java.util.List;

public class PlatformData {

    private String sensorPhysicalId;

    private String cnName;

    private String Units;

    private String sensorPhysicalValue;

    public String getSensorPhysicalId() {
        return sensorPhysicalId;
    }

    public void setSensorPhysicalId(String sensorPhysicalId) {
        this.sensorPhysicalId = sensorPhysicalId;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String units) {
        Units = units;
    }

    public String getSensorPhysicalValue() {
        return sensorPhysicalValue;
    }

    public void setSensorPhysicalValue(String sensorPhysicalValue) {
        this.sensorPhysicalValue = sensorPhysicalValue;
    }

    private String label_mac;

    private String label_type;

    private String timestamps;

    private String temp;

    private String humidity;

    private String tempUnit;

    private String humidityUnit;

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

    public String getHumidityUnit() {
        return humidityUnit;
    }

    public void setHumidityUnit(String humidityUnit) {
        this.humidityUnit = humidityUnit;
    }

    public String getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(String timestamps) {
        this.timestamps = timestamps;
    }

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public String getLabel_mac() {
        return label_mac;
    }

    public void setLabel_mac(String label_mac) {
        this.label_mac = label_mac;
    }

    public String getLabel_type() {
        return label_type;
    }

    public void setLabel_type(String label_type) {
        this.label_type = label_type;
    }

    

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    

    public static class DataBean{
        private String label_mac;
        private String label_type;
        private String timestamps;
        private String temp;
        private String humidity;
        private String tempUnit;
        private String humidityUnit; 
        private String sensorPhysicalId;
        private String cnName;
        private String Units;
        private String sensorPhysicalValue;
        
        public String getSensorPhysicalId() {
            return sensorPhysicalId;
        }
        public void setSensorPhysicalId(String sensorPhysicalId) {
            this.sensorPhysicalId = sensorPhysicalId;
        }
        public String getCnName() {
            return cnName;
        }
        public void setCnName(String cnName) {
            this.cnName = cnName;
        }
        public String getUnits() {
            return Units;
        }
        public void setUnits(String units) {
            Units = units;
        }
        public String getSensorPhysicalValue() {
            return sensorPhysicalValue;
        }
        public void setSensorPhysicalValue(String sensorPhysicalValue) {
            this.sensorPhysicalValue = sensorPhysicalValue;
        }
        public String getTimestamps() {
            return timestamps;
        }
        public void setTimestamps(String timestamps) {
            this.timestamps = timestamps;
        }
        
        public String getTempUnit() {
            return tempUnit;
        }
        public void setTempUnit(String tempUnit) {
            this.tempUnit = tempUnit;
        }
        public String getHumidityUnit() {
            return humidityUnit;
        }
        public void setHumidityUnit(String humidityUnit) {
            this.humidityUnit = humidityUnit;
        }
        public String getLabel_mac() {
            return label_mac;
        }
        public void setLabel_mac(String label_mac) {
            this.label_mac = label_mac;
        }
        public String getLabel_type() {
            return label_type;
        }
        public void setLabel_type(String label_type) {
            this.label_type = label_type;
        }
        public String getTemp() {
            return temp;
        }
        public void setTemp(String temp) {
            this.temp = temp;
        }
        public String getHumidity() {
            return humidity;
        }
        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

    }
}
