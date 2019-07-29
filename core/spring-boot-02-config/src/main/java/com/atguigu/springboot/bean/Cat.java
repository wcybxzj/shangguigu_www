package com.atguigu.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
@ConfigurationProperties(prefix = "cat")
public class Cat {

    @Value("${cat.name}")
    private String name;
    @Value("#{11*10}")
    private Integer age;

    //@Value 不能支持复杂类型
    /*
    @Value("${cat.maps}")
    private Map<String,Object> maps;

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }
    */

    @Override
    public String toString() {
        return "MAOMAOMAOMAO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
