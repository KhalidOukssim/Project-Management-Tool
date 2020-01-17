package com.khalidoukssim.ppmtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalidoukssim.ppmtool.domain.Project;
import com.khalidoukssim.ppmtool.repository.ProjectRepository;

@Service
public class ProjectServiceImp implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public ProjectServiceImp(ProjectRepository projectRepository) {
		this.projectRepository=projectRepository;
	}

	public Project saveOrUpdateProject(Project project) {
		return projectRepository.save(project);
		
	}
}
