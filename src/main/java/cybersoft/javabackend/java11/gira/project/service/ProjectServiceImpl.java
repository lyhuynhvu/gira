package cybersoft.javabackend.java11.gira.project.service;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java11.gira.commondata.GenericServiceImpl;
import cybersoft.javabackend.java11.gira.project.model.Project;
import cybersoft.javabackend.java11.gira.project.service.ift.ProjectService;

@Service
public class ProjectServiceImpl extends GenericServiceImpl<Project, Long> implements ProjectService{

}