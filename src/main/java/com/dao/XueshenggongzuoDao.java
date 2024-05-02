package com.dao;

import com.entity.XueshenggongzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshenggongzuoVO;
import com.entity.view.XueshenggongzuoView;


/**
 * 学生工作
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface XueshenggongzuoDao extends BaseMapper<XueshenggongzuoEntity> {
	
	List<XueshenggongzuoVO> selectListVO(@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);
	
	XueshenggongzuoVO selectVO(@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);
	
	List<XueshenggongzuoView> selectListView(@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);

	List<XueshenggongzuoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);
	
	XueshenggongzuoView selectView(@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);
	
}
