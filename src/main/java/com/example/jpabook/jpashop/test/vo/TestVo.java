package com.example.jpabook.jpashop.test.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestVo {

    @JsonProperty("rr")
    private String aa;

    @JsonProperty("tt")
    private Double bb;

    @JsonProperty("yy")
    private String cc;

    @JsonProperty("uu")
    private Double dd;

    @JsonProperty("ii")
    private String ee;

    @JsonProperty("oo")
    private Double ff;

    @JsonProperty("pp")
    private String gg;

    @JsonProperty("vv")
    private Double hh;

    @JsonProperty("cc")
    private String ii;

    @JsonProperty("xx")
    private Double jj;
}
