package com.dao;

import com.entity.XuexiaogaikuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaogaikuangVO;
import com.entity.view.XuexiaogaikuangView;


/**
 * 学校概况
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:46
 */
public interface XuexiaogaikuangDao extends BaseMapper<XuexiaogaikuangEntity> {
	
	List<XuexiaogaikuangVO> selectListVO(@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);
	
	XuexiaogaikuangVO selectVO(@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);
	
	List<XuexiaogaikuangView> selectListView(@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);

	List<XuexiaogaikuangView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);
	
	XuexiaogaikuangView selectView(@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);
	
}
