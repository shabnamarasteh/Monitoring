package com.j2os.monitor.modules.admin.model.repository;

import com.j2os.monitor.modules.admin.model.entity.Admin;
import com.j2os.monitor.utils.Interfaces.repository.RepositoryInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface AdminRepository extends JpaRepository<Admin, Long> , RepositoryInterface {
}
