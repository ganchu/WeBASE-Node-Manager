package com.webank.webase.node.mgr.deploy.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.webank.webase.node.mgr.deploy.entity.TbAgency;

public class TbAgencySqlProvider {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_agency
     *
     * @mbg.generated
     */
    public static final String ALL_COLUMN_FIELDS = "id,agency_name,agency_desc,chain_id,chain_name,create_time,modify_time";

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agency
     *
     * @mbg.generated
     */
    public String insertSelective(TbAgency record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_agency");
        
        if (record.getAgencyName() != null) {
            sql.VALUES("agency_name", "#{agencyName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgencyDesc() != null) {
            sql.VALUES("agency_desc", "#{agencyDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getChainId() != null) {
            sql.VALUES("chain_id", "#{chainId,jdbcType=INTEGER}");
        }
        
        if (record.getChainName() != null) {
            sql.VALUES("chain_name", "#{chainName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            sql.VALUES("modify_time", "#{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agency
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TbAgency record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_agency");
        
        if (record.getAgencyName() != null) {
            sql.SET("agency_name = #{agencyName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgencyDesc() != null) {
            sql.SET("agency_desc = #{agencyDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getChainId() != null) {
            sql.SET("chain_id = #{chainId,jdbcType=INTEGER}");
        }
        
        if (record.getChainName() != null) {
            sql.SET("chain_name = #{chainName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            sql.SET("modify_time = #{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}