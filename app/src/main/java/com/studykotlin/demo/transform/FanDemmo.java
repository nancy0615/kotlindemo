package com.studykotlin.demo.transform;

import java.util.ArrayList;
import java.util.List;

public class FanDemmo{
    //泛型通配符下限
    public void getData(List<? extends ParentDemo> list){
        ParentDemo demo = list.get(0);
        ChildDemo demo1 = (ChildDemo) list.get(2);
        getnum();
    }
    //泛型通配符上限
    public void getData1(List<? super ChildDemo> list){
        ParentDemo demo = (ParentDemo)list.get(0);
        ChildDemo demo1 = (ChildDemo) list.get(2);
    }

    class Data<String>{
    }

    public <String> void  getnum(){
        String name = (String) "str";
    }

}
