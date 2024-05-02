package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KeyankaifaDao;
import com.entity.KeyankaifaEntity;
import com.service.KeyankaifaService;
import com.entity.vo.KeyankaifaVO;
import com.entity.view.KeyankaifaView;

@Service("keyankaifaService")
public class KeyankaifaServiceImpl extends ServiceImpl<KeyankaifaDao, KeyankaifaEntity> implements KeyankaifaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyankaifaEntity> page = this.selectPage(
                new Query<KeyankaifaEntity>(params).getPage(),
                new EntityWrapper<KeyankaifaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyankaifaEntity> wrapper) {
		  Page<KeyankaifaView> page =new Query<KeyankaifaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyankaifaVO> selectListVO(Wrapper<KeyankaifaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyankaifaVO selectVO(Wrapper<KeyankaifaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyankaifaView> selectListView(Wrapper<KeyankaifaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyankaifaView selectView(Wrapper<KeyankaifaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
