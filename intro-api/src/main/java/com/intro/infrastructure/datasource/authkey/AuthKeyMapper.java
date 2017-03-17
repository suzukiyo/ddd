package com.intro.infrastructure.datasource.authkey;

import com.domain.fundamentals.authkey.AuthKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthKeyMapper {

    @Select("SELECT value FROM auth.keys WHERE value=#{value}")
    AuthKey findKeyByValue(String value);
}
