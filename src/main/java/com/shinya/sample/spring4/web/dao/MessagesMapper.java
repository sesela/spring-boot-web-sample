package com.shinya.sample.spring4.web.dao;

import com.shinya.sample.spring4.web.model.Messages;
import com.shinya.sample.spring4.web.model.MessagesExample;
import java.util.List;

public interface MessagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    int insert(Messages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    int insertSelective(Messages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    List<Messages> selectByExampleWithBLOBs(MessagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    List<Messages> selectByExample(MessagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    Messages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    int updateByPrimaryKeySelective(Messages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    int updateByPrimaryKeyWithBLOBs(Messages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table messages
     *
     * @mbggenerated Sun Oct 25 22:56:19 JST 2015
     */
    int updateByPrimaryKey(Messages record);
}