package com.lab.test.pojo;
import java.util.List;

public class PlatformData {
    private String label_mac;

    private String label_type;

    private String date;

    private String temp;

    private String humidity;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        private String date;
        private String temp;
        private String humidity;
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
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
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
