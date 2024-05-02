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


import com.dao.XuexiaogaikuangDao;
import com.entity.XuexiaogaikuangEntity;
import com.service.XuexiaogaikuangService;
import com.entity.vo.XuexiaogaikuangVO;
import com.entity.view.XuexiaogaikuangView;

@Service("xuexiaogaikuangService")
public class XuexiaogaikuangServiceImpl extends ServiceImpl<XuexiaogaikuangDao, XuexiaogaikuangEntity> implements XuexiaogaikuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaogaikuangEntity> page = this.selectPage(
                new Query<XuexiaogaikuangEntity>(params).getPage(),
                new EntityWrapper<XuexiaogaikuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaogaikuangEntity> wrapper) {
		  Page<XuexiaogaikuangView> page =new Query<XuexiaogaikuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaogaikuangVO> selectListVO(Wrapper<XuexiaogaikuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaogaikuangVO selectVO(Wrapper<XuexiaogaikuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaogaikuangView> selectListView(Wrapper<XuexiaogaikuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaogaikuangView selectView(Wrapper<XuexiaogaikuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
