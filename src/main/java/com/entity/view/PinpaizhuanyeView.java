package com.entity.view;

import com.entity.PinpaizhuanyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 品牌专业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
@TableName("pinpaizhuanye")
public class PinpaizhuanyeView  extends PinpaizhuanyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PinpaizhuanyeView(){
	}
 
 	public PinpaizhuanyeView(PinpaizhuanyeEntity pinpaizhuanyeEntity){
 	try {
			BeanUtils.copyProperties(this, pinpaizhuanyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
