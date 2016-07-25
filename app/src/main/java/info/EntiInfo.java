package info;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/6/16.
 */
public class EntiInfo<T> {
    String message;
    String status;
ArrayList<DataInfo> data;
    public EntiInfo(String message, String status, ArrayList<DataInfo> data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataInfo> getData() {
        return data;
    }

    public void setData(ArrayList<DataInfo> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EntiInfo{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
