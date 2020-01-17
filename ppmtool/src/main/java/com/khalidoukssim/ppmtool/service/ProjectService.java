package com.khalidoukssim.ppmtool.service;

import org.springframework.validation.BindingResult;

import com.khalidoukssim.ppmtool.domain.Project;

public interface ProjectService {
	
	public Project saveOrUpdateProject(Project project);

}
