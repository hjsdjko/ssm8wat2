package com.entity.vo;

import com.entity.JiuyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 就业信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public class JiuyexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
