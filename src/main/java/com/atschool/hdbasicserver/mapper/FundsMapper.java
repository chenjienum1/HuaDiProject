package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.Funds;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FundsMapper {
    public void addFunds(String town, String village, int account, int realAccount, boolean available, String comment, String accountant, String functionary);
    public List<Funds> getFunds();
    public void deleteFunds(int id);
    public List<Funds> getIncome();
    public List<Funds> getExpend();
    public Funds getFundsByID(int id);
}
