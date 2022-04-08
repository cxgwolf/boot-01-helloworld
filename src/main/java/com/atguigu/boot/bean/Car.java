package com.atguigu.boot.bean;


import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能cxgccc hello git4master  1111
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能cxgccc hello git4hotfix jiushisi push
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能cxgccc hello git4master
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能cxgccc hello git4hotfix jiushisi push 4523463456234562354634
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;


}
