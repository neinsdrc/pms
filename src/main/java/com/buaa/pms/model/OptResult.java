package com.buaa.pms.model;

import java.util.List;

public class OptResult {
    private List<Task> taskList;
    private List<List<ResOcpyNode>> resOcpyNodesList;

    public OptResult() {
    }

    public OptResult(List<Task> taskList, List<List<ResOcpyNode>> resOcpyNodesList) {
        this.taskList = taskList;
        this.resOcpyNodesList = resOcpyNodesList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<List<ResOcpyNode>> getResOcpyNodesList() {
        return resOcpyNodesList;
    }

    public void setResOcpyNodesList(List<List<ResOcpyNode>> resOcpyNodesList) {
        this.resOcpyNodesList = resOcpyNodesList;
    }
}
