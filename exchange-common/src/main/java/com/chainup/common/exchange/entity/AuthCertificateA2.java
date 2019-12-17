package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AuthCertificateA2 implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Byte authStatus;

    @Length(max=20)
    private String liveContury;
    private String liveCountryName;

    @Length(max=255)
    private String province;

    @Length(max=255)
    private String city;

    @Length(max=255)
    private String district;

    @Length(max=255)
    private String street;

    @Length(max=255)
    private String village;

    @Length(max=255)
    private String houseNum;

    @Length(max=255)
    private String postalcode;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @Length(max=255)
    private String reason;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Byte authStatus) {
        this.authStatus = authStatus;
    }

    public String getLiveContury() {
        return liveContury;
    }

    public void setLiveContury(String liveContury) {
        this.liveContury = liveContury == null ? null : liveContury.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum == null ? null : houseNum.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getLiveCountryName() {
        return liveCountryName;
    }

    public void setLiveCountryName(String liveCountryName) {
        this.liveCountryName = liveCountryName;
    }

    public static class Builder {
        private AuthCertificateA2 obj;

        public Builder() {
            this.obj = new AuthCertificateA2();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder authStatus(Byte authStatus) {
            obj.authStatus = authStatus;
            return this;
        }

        public Builder liveContury(String liveContury) {
            obj.liveContury = liveContury;
            return this;
        }

        public Builder province(String province) {
            obj.province = province;
            return this;
        }

        public Builder city(String city) {
            obj.city = city;
            return this;
        }

        public Builder district(String district) {
            obj.district = district;
            return this;
        }

        public Builder street(String street) {
            obj.street = street;
            return this;
        }

        public Builder village(String village) {
            obj.village = village;
            return this;
        }

        public Builder houseNum(String houseNum) {
            obj.houseNum = houseNum;
            return this;
        }

        public Builder postalcode(String postalcode) {
            obj.postalcode = postalcode;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Builder reason(String reason) {
            obj.reason = reason;
            return this;
        }

        public AuthCertificateA2 build() {
            return this.obj;
        }
    }
}