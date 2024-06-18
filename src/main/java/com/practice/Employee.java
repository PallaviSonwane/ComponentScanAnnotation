package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("emp")
public class Employee {
    int no;

    @Value("5")
    public void setnumber(int no){
        this.no=no;
    }
    public int getsqure(){
        return no*no;
    }
}
