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


import com.dao.XuexiaodongtaiDao;
import com.entity.XuexiaodongtaiEntity;
import com.service.XuexiaodongtaiService;
import com.entity.vo.XuexiaodongtaiVO;
import com.entity.view.XuexiaodongtaiView;

@Service("xuexiaodongtaiService")
public class XuexiaodongtaiServiceImpl extends ServiceImpl<XuexiaodongtaiDao, XuexiaodongtaiEntity> implements XuexiaodongtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaodongtaiEntity> page = this.selectPage(
                new Query<XuexiaodongtaiEntity>(params).getPage(),
                new EntityWrapper<XuexiaodongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaodongtaiEntity> wrapper) {
		  Page<XuexiaodongtaiView> page =new Query<XuexiaodongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaodongtaiVO> selectListVO(Wrapper<XuexiaodongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaodongtaiVO selectVO(Wrapper<XuexiaodongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaodongtaiView> selectListView(Wrapper<XuexiaodongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaodongtaiView selectView(Wrapper<XuexiaodongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
