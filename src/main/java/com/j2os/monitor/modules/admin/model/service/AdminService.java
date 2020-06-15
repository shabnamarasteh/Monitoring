package com.j2os.monitor.modules.admin.model.service;

import com.j2os.monitor.modules.admin.model.entity.Admin;
import com.j2os.monitor.modules.admin.model.repository.AdminRepository;
import com.j2os.monitor.utils.Interfaces.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements ServiceInterface<Admin> {
    private AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin add(Admin admin) {
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        return null;
    }

    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Admin findOne(Admin admin) {
        return null;
    }

    @Override
    public Admin findById(long id) {
        return null;
    }

    @Override
    public List<Admin> delete(Admin admin) {
        return null;
    }

    @Override
    public List<Admin> findAllPageable(Pageable pageable) {
        return null;
    }
}
