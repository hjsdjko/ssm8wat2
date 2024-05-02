package com.dao;

import com.entity.PinpaizhuanyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinpaizhuanyeVO;
import com.entity.view.PinpaizhuanyeView;


/**
 * 品牌专业
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface PinpaizhuanyeDao extends BaseMapper<PinpaizhuanyeEntity> {
	
	List<PinpaizhuanyeVO> selectListVO(@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);
	
	PinpaizhuanyeVO selectVO(@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);
	
	List<PinpaizhuanyeView> selectListView(@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);

	List<PinpaizhuanyeView> selectListView(Pagination page,@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);
	
	PinpaizhuanyeView selectView(@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);
	
}
