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


import com.dao.XueshenggongzuoDao;
import com.entity.XueshenggongzuoEntity;
import com.service.XueshenggongzuoService;
import com.entity.vo.XueshenggongzuoVO;
import com.entity.view.XueshenggongzuoView;

@Service("xueshenggongzuoService")
public class XueshenggongzuoServiceImpl extends ServiceImpl<XueshenggongzuoDao, XueshenggongzuoEntity> implements XueshenggongzuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshenggongzuoEntity> page = this.selectPage(
                new Query<XueshenggongzuoEntity>(params).getPage(),
                new EntityWrapper<XueshenggongzuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshenggongzuoEntity> wrapper) {
		  Page<XueshenggongzuoView> page =new Query<XueshenggongzuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshenggongzuoVO> selectListVO(Wrapper<XueshenggongzuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshenggongzuoVO selectVO(Wrapper<XueshenggongzuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshenggongzuoView> selectListView(Wrapper<XueshenggongzuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshenggongzuoView selectView(Wrapper<XueshenggongzuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
