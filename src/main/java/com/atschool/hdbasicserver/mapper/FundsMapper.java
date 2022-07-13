package com.atschool.hdbasicserver.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FundsMapper {
    public void addFunds(String town, String village, int account, int realAccount, boolean available, String comment, String accountant, String functionary);
}
