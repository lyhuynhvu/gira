package cybersoft.javabackend.java11.gira.role.service;

import java.util.List;

import cybersoft.javabackend.java11.gira.role.dto.CreateRoleDto;
import cybersoft.javabackend.java11.gira.role.dto.RoleWithAccountsDTO;
import cybersoft.javabackend.java11.gira.role.model.Role;

public interface RoleService {
	void save(Role role);
	List<Role> findAll();
	List<Role> findByRoleName(String roleName);
	List<Role> findByDescription(String description);
	List<Role> findRoleWithoutBlankDescription(String roleName);
	List<RoleWithAccountsDTO> findRoleWithAccountInfo();
	Role updateRoleInfo(CreateRoleDto dto, Long roleId);
	void deleteById(Long roleId);
	Role save(CreateRoleDto dto);
}
