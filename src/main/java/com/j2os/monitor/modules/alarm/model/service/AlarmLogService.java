package com.j2os.monitor.modules.alarm.model.service;

import com.j2os.monitor.modules.alarm.model.entity.AlarmLog;
import com.j2os.monitor.modules.alarm.model.repository.AlarmLogRepository;
import com.j2os.monitor.modules.common.MyBeanCopy;
import com.j2os.monitor.utils.Interfaces.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class AlarmLogService  implements ServiceInterface<AlarmLog> {
    private AlarmLogRepository alarmLogRepository;
    @Autowired
    public AlarmLogService(AlarmLogRepository alarmLogRepository) {
        this.alarmLogRepository = alarmLogRepository;
    }

    @Override
    @Transactional
    public AlarmLog add(AlarmLog alarmLog) {
        return this.alarmLogRepository.save(alarmLog);
    }

    @Override
    @Transactional
    public AlarmLog update(AlarmLog alarmLog) throws InvocationTargetException, IllegalAccessException {
            AlarmLog exist = this.alarmLogRepository.getOne(alarmLog.getId());
            MyBeanCopy myBeanCopy = new MyBeanCopy();
            myBeanCopy.copyProperties(exist, alarmLog);
            return this.alarmLogRepository.save(exist);
    }

    @Override
    public List<AlarmLog> findAll() {
        return this.alarmLogRepository.findAll();
    }

    @Override
    @Transactional
    public List<AlarmLog> delete(AlarmLog alarmLog) {
        this.alarmLogRepository.delete(alarmLog);
        return this.alarmLogRepository.findAll();
    }

    @Override
    public List<AlarmLog> findAllPageable(Pageable pageable) {
        return (List<AlarmLog>) this.alarmLogRepository.findAll(pageable);
    }

    @Override
    public AlarmLog findOne(AlarmLog alarmLog) {
        return this.alarmLogRepository.getOne(alarmLog.getId());
    }

    @Override
    public AlarmLog findById(long id) {
        return this.alarmLogRepository.getOne(id);
    }
}
