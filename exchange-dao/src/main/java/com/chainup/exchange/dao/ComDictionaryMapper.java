package com.chainup.exchange.dao;


import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ComDictionary;

public interface ComDictionaryMapper extends SqlMapper {
    /**
     *
     * @mbggenerated 2020-01-09
     */
    int deleteByPrimaryKey(Integer dictionaryId);

    /**
     *
     * @mbggenerated 2020-01-09
     */
    int insert(ComDictionary record);

    /**
     *
     * @mbggenerated 2020-01-09
     */
    int insertSelective(ComDictionary record);

    /**
     *
     * @mbggenerated 2020-01-09
     */
    ComDictionary selectByPrimaryKey(Integer dictionaryId);

    /**
     *
     * @mbggenerated 2020-01-09
     */
    int updateByPrimaryKeySelective(ComDictionary record);

    /**
     *
     * @mbggenerated 2020-01-09
     */
    int updateByPrimaryKey(ComDictionary record);

    int selectSetDictionaryCountBycode(ComDictionary comDictionary);
}