package com.services;

import java.util.List;

import com.entities.Info;

public interface InfoService {
	public void create(Info belonging);

	public void createMany(List<Info> list);

	public List<Info> readAll();

	public void update(Info belonging);

	public void delete(Info belonging);
}
