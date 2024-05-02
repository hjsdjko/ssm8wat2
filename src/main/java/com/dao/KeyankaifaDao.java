package com.dao;

import com.entity.KeyankaifaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyankaifaVO;
import com.entity.view.KeyankaifaView;


/**
 * 科研开发
 * 
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface KeyankaifaDao extends BaseMapper<KeyankaifaEntity> {
	
	List<KeyankaifaVO> selectListVO(@Param("ew") Wrapper<KeyankaifaEntity> wrapper);
	
	KeyankaifaVO selectVO(@Param("ew") Wrapper<KeyankaifaEntity> wrapper);
	
	List<KeyankaifaView> selectListView(@Param("ew") Wrapper<KeyankaifaEntity> wrapper);

	List<KeyankaifaView> selectListView(Pagination page,@Param("ew") Wrapper<KeyankaifaEntity> wrapper);
	
	KeyankaifaView selectView(@Param("ew") Wrapper<KeyankaifaEntity> wrapper);
	
}
