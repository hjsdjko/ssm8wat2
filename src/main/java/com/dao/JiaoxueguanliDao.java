package com.dao;

import com.entity.JiaoxueguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxueguanliVO;
import com.entity.view.JiaoxueguanliView;


/**
 * 教学管理
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface JiaoxueguanliDao extends BaseMapper<JiaoxueguanliEntity> {
	
	List<JiaoxueguanliVO> selectListVO(@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);
	
	JiaoxueguanliVO selectVO(@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);
	
	List<JiaoxueguanliView> selectListView(@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);

	List<JiaoxueguanliView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);
	
	JiaoxueguanliView selectView(@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);
	
}
