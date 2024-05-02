package com.entity.view;

import com.entity.KeyankaifaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科研开发
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
@TableName("keyankaifa")
public class KeyankaifaView  extends KeyankaifaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyankaifaView(){
	}
 
 	public KeyankaifaView(KeyankaifaEntity keyankaifaEntity){
 	try {
			BeanUtils.copyProperties(this, keyankaifaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
