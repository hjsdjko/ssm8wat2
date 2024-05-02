package com.dao;

import com.entity.ZhaoshengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaoshengxinxiVO;
import com.entity.view.ZhaoshengxinxiView;


/**
 * 招生信息
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface ZhaoshengxinxiDao extends BaseMapper<ZhaoshengxinxiEntity> {
	
	List<ZhaoshengxinxiVO> selectListVO(@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);
	
	ZhaoshengxinxiVO selectVO(@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);
	
	List<ZhaoshengxinxiView> selectListView(@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);

	List<ZhaoshengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);
	
	ZhaoshengxinxiView selectView(@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);
	
}
