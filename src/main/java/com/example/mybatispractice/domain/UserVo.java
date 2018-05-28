package com.example.mybatispractice.domain;

import lombok.Data;

public class UserVo {
    private Long seq;
    private String name;

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "seq=" + seq +
                ", name='" + name + '\'' +
                '}';
    }
}
