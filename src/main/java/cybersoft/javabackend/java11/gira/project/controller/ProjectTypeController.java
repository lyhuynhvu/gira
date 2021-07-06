package cybersoft.javabackend.java11.gira.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java11.gira.commondata.model.ResponseHandler;
import cybersoft.javabackend.java11.gira.project.model.ProjectType;
import cybersoft.javabackend.java11.gira.project.service.ift.ProjectTypeService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/project/type")
public class ProjectTypeController {
	private ProjectTypeService service;
	
	@GetMapping
	public ResponseEntity<Object> findAllProjectType(){
		List<ProjectType> projectTypes = service.findAll();
		
		if(projectTypes.isEmpty())
			return ResponseHandler.getResponse("There is no data.", HttpStatus.OK);
		
		return ResponseHandler.getResponse(projectTypes, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> addNewProjectType(@Valid @RequestBody ProjectType projectType,
													BindingResult bindingResult){
		if(bindingResult.hasErrors())
			return ResponseHandler.getResponse(bindingResult, HttpStatus.BAD_REQUEST);
		
		ProjectType addedModel = service.save(projectType);
		
		return ResponseHandler.getResponse(addedModel, HttpStatus.OK);
	}
}
