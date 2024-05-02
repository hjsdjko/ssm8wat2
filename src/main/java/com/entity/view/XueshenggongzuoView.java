package com.entity.view;

import com.entity.XueshenggongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生工作
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
@TableName("xueshenggongzuo")
public class XueshenggongzuoView  extends XueshenggongzuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshenggongzuoView(){
	}
 
 	public XueshenggongzuoView(XueshenggongzuoEntity xueshenggongzuoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshenggongzuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
