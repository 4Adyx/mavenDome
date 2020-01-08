package com.shop2.pojo;

import java.io.Serializable;

public class TbDing implements Serializable{
    private Integer id;

    private Integer sid;

    private String ssum;

    private String price;

    private Integer fh;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSsum() {
        return ssum;
    }

    public void setSsum(String ssum) {
        this.ssum = ssum == null ? null : ssum.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getFh() {
        return fh;
    }

    public void setFh(Integer fh) {
        this.fh = fh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}