package com.chainup.common.exchange.entity;

import java.io.Serializable;

public class AuthCertificateA2WithBLOBs extends AuthCertificateA2 implements Serializable {
    private byte[] firstPhoto;
    private String firstPh;

    private byte[] secondPhoto;
    private String secondPh;

    private byte[] fourthPhoto;
    private String fourthPh;

    private byte[] livePhoto;
    private String livePh;

    private static final long serialVersionUID = 1L;

    public byte[] getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(byte[] firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

    public byte[] getSecondPhoto() {
        return secondPhoto;
    }

    public void setSecondPhoto(byte[] secondPhoto) {
        this.secondPhoto = secondPhoto;
    }

    public byte[] getFourthPhoto() {
        return fourthPhoto;
    }

    public void setFourthPhoto(byte[] fourthPhoto) {
        this.fourthPhoto = fourthPhoto;
    }

    public byte[] getLivePhoto() {
        return livePhoto;
    }

    public void setLivePhoto(byte[] livePhoto) {
        this.livePhoto = livePhoto;
    }

    public String getFirstPh() {
        return firstPh;
    }

    public void setFirstPh(String firstPh) {
        this.firstPh = firstPh;
    }

    public String getSecondPh() {
        return secondPh;
    }

    public void setSecondPh(String secondPh) {
        this.secondPh = secondPh;
    }

    public String getFourthPh() {
        return fourthPh;
    }

    public void setFourthPh(String fourthPh) {
        this.fourthPh = fourthPh;
    }

    public String getLivePh() {
        return livePh;
    }

    public void setLivePh(String livePh) {
        this.livePh = livePh;
    }
}