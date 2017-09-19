package com.yao.model;

import java.util.Date;

public class GongTianModel {
    private Integer id;

    private Date riqi;

    private String xqmc;

    private String lh;

    private String zxgs;

    private String lxr;

    private Long phone;

    private String yc;

    private Integer sl;

    private Double jg;

    private String bz;

    private Integer sfyf;

    private Date tjsj;

    private String param;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc == null ? null : xqmc.trim();
    }

    public String getLh() {
        return lh;
    }

    public void setLh(String lh) {
        this.lh = lh == null ? null : lh.trim();
    }

    public String getZxgs() {
        return zxgs;
    }

    public void setZxgs(String zxgs) {
        this.zxgs = zxgs == null ? null : zxgs.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getYc() {
        return yc;
    }

    public void setYc(String yc) {
        this.yc = yc == null ? null : yc.trim();
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public Double getJg() {
        return jg;
    }

    public void setJg(Double jg) {
        this.jg = jg;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Integer getSfyf() {
        return sfyf;
    }

    public void setSfyf(Integer sfyf) {
        this.sfyf = sfyf;
    }

    public Date getTjsj() {
        return tjsj;
    }

    public void setTjsj(Date tjsj) {
        this.tjsj = tjsj;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}