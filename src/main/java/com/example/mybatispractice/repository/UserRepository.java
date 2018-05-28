package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {
    List<UserVo> getUserList();
}
