package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daos.InfoDao;
import com.entities.Info;

@Service("infoService")
@Transactional
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	private InfoDao infoDao;

	public void setBelongingDao(InfoDao belongingDao) {
		this.infoDao = belongingDao;
	}

	@Override
	public void create(Info belonging) {
		this.infoDao.create(belonging);
	}

	@Override
	public void createMany(List<Info> list) {
		this.infoDao.createMany(list);
	}

	@Override
	public List<Info> readAll() {
		return null;
	}

	@Override
	public void update(Info belonging) {

	}

	@Override
	public void delete(Info belonging) {

	}

}
