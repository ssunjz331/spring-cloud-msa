package com.example.userservicce.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {
    private String productId;
    private Integer gty;
    private Integer unitPrice;
    private Integer totalPrice;
    private Date createdAt;

    private String orderId;
}
