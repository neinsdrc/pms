package com.buaa.pms.entity;

import java.sql.Date;

public class PmsProcess {

    private String procUid;
    private String procId;
    private String procName;
    private String procProjUid;
    private String procProjName;
    private String procAuthor;
    private Date procPlanStartDate;
    private Date procPlanFinishDate;
    private Integer procPlanDur;
    private Date procEarlyStartDate;
    private Date procLateFinishDate;
    private Integer procStatus;

    public String getProcUid() {
        return procUid;
    }

    public void setProcUid(String procUid) {
        this.procUid = procUid;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    public String getProcProjUid() {
        return procProjUid;
    }

    public void setProcProjUid(String procProjUid) {
        this.procProjUid = procProjUid;
    }

    public String getProcProjName() {
        return procProjName;
    }

    public void setProcProjName(String procProjName) {
        this.procProjName = procProjName;
    }

    public String getProcAuthor() {
        return procAuthor;
    }

    public void setProcAuthor(String procAuthor) {
        this.procAuthor = procAuthor;
    }

    public Date getProcPlanStartDate() {
        return procPlanStartDate;
    }

    public void setProcPlanStartDate(Date procPlanStartDate) {
        this.procPlanStartDate = procPlanStartDate;
    }

    public Date getProcPlanFinishDate() {
        return procPlanFinishDate;
    }

    public void setProcPlanFinishDate(Date procPlanFinishDate) {
        this.procPlanFinishDate = procPlanFinishDate;
    }

    public Integer getProcPlanDur() {
        return procPlanDur;
    }

    public void setProcPlanDur(Integer procPlanDur) {
        this.procPlanDur = procPlanDur;
    }

    public Date getProcEarlyStartDate() {
        return procEarlyStartDate;
    }

    public void setProcEarlyStartDate(Date procEarlyStartDate) {
        this.procEarlyStartDate = procEarlyStartDate;
    }

    public Date getProcLateFinishDate() {
        return procLateFinishDate;
    }

    public void setProcLateFinishDate(Date procLateFinishDate) {
        this.procLateFinishDate = procLateFinishDate;
    }

    public Integer getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(Integer procStatus) {
        this.procStatus = procStatus;
    }

    @Override
    public String toString() {
        return "PmsProcess{" +
                "procUid='" + procUid + '\'' +
                ", procId='" + procId + '\'' +
                ", procName='" + procName + '\'' +
                ", procProjUid='" + procProjUid + '\'' +
                ", procProjName='" + procProjName + '\'' +
                ", procAuthor='" + procAuthor + '\'' +
                ", procPlanStartDate=" + procPlanStartDate +
                ", procPlanFinishDate=" + procPlanFinishDate +
                ", procPlanDur=" + procPlanDur +
                ", procEarlyStartDate=" + procEarlyStartDate +
                ", procLateFinishDate=" + procLateFinishDate +
                ", procStatus=" + procStatus +
                '}';
    }
}