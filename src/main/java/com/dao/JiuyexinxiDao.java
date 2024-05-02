package com.dao;

import com.entity.JiuyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuyexinxiVO;
import com.entity.view.JiuyexinxiView;


/**
 * 就业信息
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface JiuyexinxiDao extends BaseMapper<JiuyexinxiEntity> {
	
	List<JiuyexinxiVO> selectListVO(@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);
	
	JiuyexinxiVO selectVO(@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);
	
	List<JiuyexinxiView> selectListView(@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);

	List<JiuyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);
	
	JiuyexinxiView selectView(@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);
	
}
