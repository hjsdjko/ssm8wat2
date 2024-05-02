package com.dao;

import com.entity.JixujiaoyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JixujiaoyuVO;
import com.entity.view.JixujiaoyuView;


/**
 * 继续教育
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface JixujiaoyuDao extends BaseMapper<JixujiaoyuEntity> {
	
	List<JixujiaoyuVO> selectListVO(@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);
	
	JixujiaoyuVO selectVO(@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);
	
	List<JixujiaoyuView> selectListView(@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);

	List<JixujiaoyuView> selectListView(Pagination page,@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);
	
	JixujiaoyuView selectView(@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);
	
}
