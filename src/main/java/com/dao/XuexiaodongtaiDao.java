package com.dao;

import com.entity.XuexiaodongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaodongtaiVO;
import com.entity.view.XuexiaodongtaiView;


/**
 * 学校动态
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:46
 */
public interface XuexiaodongtaiDao extends BaseMapper<XuexiaodongtaiEntity> {
	
	List<XuexiaodongtaiVO> selectListVO(@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);
	
	XuexiaodongtaiVO selectVO(@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);
	
	List<XuexiaodongtaiView> selectListView(@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);

	List<XuexiaodongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);
	
	XuexiaodongtaiView selectView(@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);
	
}
