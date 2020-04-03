package com.buaa.pms.entity;

public class PmsEquipment {

    private String equipUid;
    private String equipId;
    private String equipName;
    private String equipOrgUid;
    private String equipCapType;
    private String equipCapLevel;
    private String equipCapDesc;
    private Integer equipStatus;
    private String equipCurrTaskUid;

    public String getEquipUid() {
        return equipUid;
    }

    public void setEquipUid(String equipUid) {
        this.equipUid = equipUid;
    }

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipOrgUid() {
        return equipOrgUid;
    }

    public void setEquipOrgUid(String equipOrgUid) {
        this.equipOrgUid = equipOrgUid;
    }

    public String getEquipCapType() {
        return equipCapType;
    }

    public void setEquipCapType(String equipCapType) {
        this.equipCapType = equipCapType;
    }

    public String getEquipCapLevel() {
        return equipCapLevel;
    }

    public void setEquipCapLevel(String equipCapLevel) {
        this.equipCapLevel = equipCapLevel;
    }

    public String getEquipCapDesc() {
        return equipCapDesc;
    }

    public void setEquipCapDesc(String equipCapDesc) {
        this.equipCapDesc = equipCapDesc;
    }

    public Integer getEquipStatus() {
        return equipStatus;
    }

    public void setEquipStatus(Integer equipStatus) {
        this.equipStatus = equipStatus;
    }

    public String getEquipCurrTaskUid() {
        return equipCurrTaskUid;
    }

    public void setEquipCurrTaskUid(String equipCurrTaskUid) {
        this.equipCurrTaskUid = equipCurrTaskUid;
    }

    @Override
    public String toString() {
        return "PmsEquipment{" +
                "equipUid='" + equipUid + '\'' +
                ", equipId='" + equipId + '\'' +
                ", equipName='" + equipName + '\'' +
                ", equipOrgUid='" + equipOrgUid + '\'' +
                ", equipCapType='" + equipCapType + '\'' +
                ", equipCapLevel='" + equipCapLevel + '\'' +
                ", equipCapDesc='" + equipCapDesc + '\'' +
                ", equipStatus=" + equipStatus +
                ", equipCurrTaskUid='" + equipCurrTaskUid + '\'' +
                '}';
    }
}
