package com.ycm.data;

import lombok.Data;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
public class SampleBusinessObject {

    String summary;
    Date timestamp;

    List<String> names;

    public static SampleBusinessObject createSampleBOInstance() {
        SampleBusinessObject bo = new SampleBusinessObject();
        bo.summary = "This is breaking news";
        bo.timestamp = new Date();
        bo.names = Arrays.asList("China","Singapore","United States");
        return bo;
    }

    public static List<SampleBusinessObject> createSampleBOList() {
        SampleBusinessObject bo1 = new SampleBusinessObject();
        bo1.summary = "This is a good news";
        bo1.timestamp = new Date();
        bo1.names = Arrays.asList("China","Singapore");

        SampleBusinessObject bo2 = new SampleBusinessObject();
        bo2.summary = "This is a bad news";
        bo2.timestamp = new Date();
        bo2.names = Arrays.asList("Africa");

        return Arrays.asList(bo1,bo2);
    }

}
