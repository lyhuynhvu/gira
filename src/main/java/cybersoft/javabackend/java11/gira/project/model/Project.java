package cybersoft.javabackend.java11.gira.project.model;

import java.time.LocalDateTime;
import java.util.Set;

import cybersoft.javabackend.java11.gira.user.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
	private String name;
	private String code;
	private User owner;
	private User manager;
	private String icon;
	private String description;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private ProjectType projectType;
	private Set<Workflow> workflows;
}
