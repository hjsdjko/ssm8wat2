package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 就业信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
@TableName("jiuyexinxi")
public class JiuyexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuyexinxiEntity() {
		
	}
	
	public JiuyexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 招聘会名称
	 */
					
	private String zhaopinhuimingcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	/**
	 * 招聘会类型
	 */
					
	private String zhaopinhuileixing;
	
	/**
	 * 举办城市
	 */
					
	private String jubanchengshi;
	
	/**
	 * 举办地址
	 */
					
	private String jubandizhi;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：招聘会名称
	 */
	public void setZhaopinhuimingcheng(String zhaopinhuimingcheng) {
		this.zhaopinhuimingcheng = zhaopinhuimingcheng;
	}
	/**
	 * 获取：招聘会名称
	 */
	public String getZhaopinhuimingcheng() {
		return zhaopinhuimingcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：封面图片
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * 设置：招聘会类型
	 */
	public void setZhaopinhuileixing(String zhaopinhuileixing) {
		this.zhaopinhuileixing = zhaopinhuileixing;
	}
	/**
	 * 获取：招聘会类型
	 */
	public String getZhaopinhuileixing() {
		return zhaopinhuileixing;
	}
	/**
	 * 设置：举办城市
	 */
	public void setJubanchengshi(String jubanchengshi) {
		this.jubanchengshi = jubanchengshi;
	}
	/**
	 * 获取：举办城市
	 */
	public String getJubanchengshi() {
		return jubanchengshi;
	}
	/**
	 * 设置：举办地址
	 */
	public void setJubandizhi(String jubandizhi) {
		this.jubandizhi = jubandizhi;
	}
	/**
	 * 获取：举办地址
	 */
	public String getJubandizhi() {
		return jubandizhi;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
