package cybersoft.javabackend.java11.gira.role.service;

import javax.validation.Valid;

import cybersoft.javabackend.java11.gira.commondata.GenericService;
import cybersoft.javabackend.java11.gira.role.model.Role;
import cybersoft.javabackend.java11.gira.role.model.RoleGroup;

public interface RoleGroupService extends GenericService<RoleGroup, Long> {

	RoleGroup addRole(@Valid Role role, Long groupId);
	
}
