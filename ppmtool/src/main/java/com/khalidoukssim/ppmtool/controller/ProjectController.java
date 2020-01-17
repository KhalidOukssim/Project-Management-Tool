package com.khalidoukssim.ppmtool.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khalidoukssim.ppmtool.domain.Project;
import com.khalidoukssim.ppmtool.service.MapValidationErrorService;
import com.khalidoukssim.ppmtool.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	public ProjectController(ProjectService projetService) {
		this.projectService=projetService;
	}
	
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project,BindingResult result){
		if(result.hasErrors()) {
			return new MapValidationErrorService().Mapvalidation(result);
		}
		Project project1 =projectService.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(project1,HttpStatus.CREATED);
	}
	

}
