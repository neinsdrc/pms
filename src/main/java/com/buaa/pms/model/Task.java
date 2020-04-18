package com.buaa.pms.model;

import com.buaa.pms.entity.PmsTask;
import com.buaa.pms.entity.PmsTaskLink;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Task {

    private PmsTask pmsTask;
    // 紧后任务集合
    private List<PmsTask> taskNormalPreTasks;
    private List<PmsTask> taskRealPreTasks;

    public Task() {}

    public Task(PmsTask pmsTask) {
        this.pmsTask = pmsTask;
    }

    public Task(PmsTask pmsTask, List<PmsTask> taskNormalPreTasks, List<PmsTask> taskRealPreTasks) {
        this.pmsTask = pmsTask;
        this.taskNormalPreTasks = taskNormalPreTasks;
        this.taskRealPreTasks = taskRealPreTasks;
    }

    public Task(PmsTask pmsTask, List<PmsTask> taskNormalPreTasks) {
        this.pmsTask = pmsTask;
        this.taskNormalPreTasks = taskNormalPreTasks;
    }

    public PmsTask getPmsTask() {
        return pmsTask;
    }

    public void setPmsTask(PmsTask pmsTask) {
        this.pmsTask = pmsTask;
    }

    public List<PmsTask> getTaskNormalPreTasks() {
        return taskNormalPreTasks;
    }

    public void setTaskNormalPreTasks(List<PmsTask> taskNormalPreTasks) {
        this.taskNormalPreTasks = taskNormalPreTasks;
    }

    public List<PmsTask> getTaskRealPreTasks() {
        return taskRealPreTasks;
    }

    public void setTaskRealPreTasks(List<PmsTask> taskRealPreTasks) {
        this.taskRealPreTasks = taskRealPreTasks;
    }
}
