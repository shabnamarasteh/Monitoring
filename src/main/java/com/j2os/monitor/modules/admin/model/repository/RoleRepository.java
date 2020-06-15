package com.j2os.monitor.modules.admin.model.repository;

import com.j2os.monitor.modules.admin.model.entity.Role;
import com.j2os.monitor.utils.Interfaces.repository.RepositoryInterface;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>, RepositoryInterface {
}
