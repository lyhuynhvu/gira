package cybersoft.javabackend.java11.gira.project.service;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java11.gira.commondata.GenericServiceImpl;
import cybersoft.javabackend.java11.gira.project.model.ProjectType;
import cybersoft.javabackend.java11.gira.project.service.ift.ProjectTypeService;

@Service
public class ProjectTypeServiceImpl extends GenericServiceImpl<ProjectType, Long> implements ProjectTypeService{

}
