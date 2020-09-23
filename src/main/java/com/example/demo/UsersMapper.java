package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface UsersMapper {
	public List<Map<String, String>> findAll();
}
