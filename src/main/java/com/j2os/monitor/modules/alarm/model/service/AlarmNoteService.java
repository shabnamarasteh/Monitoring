package com.j2os.monitor.modules.alarm.model.service;

import com.j2os.monitor.modules.alarm.model.entity.AlarmNote;
import com.j2os.monitor.modules.alarm.model.repository.AlarmNoteRepository;
import com.j2os.monitor.modules.common.MyBeanCopy;
import com.j2os.monitor.utils.Interfaces.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class AlarmNoteService implements ServiceInterface<AlarmNote> {
    private AlarmNoteRepository alarmNoteRepository;

    @Autowired
    public AlarmNoteService(AlarmNoteRepository alarmNoteRepository) {
        this.alarmNoteRepository = alarmNoteRepository;
    }

    @Override
    @Transactional
    public AlarmNote add(AlarmNote alarmNote) {
        return this.alarmNoteRepository.save(alarmNote);
    }

    @Override
    @Transactional
    public AlarmNote update(AlarmNote alarmNote) throws InvocationTargetException, IllegalAccessException {
        AlarmNote exist = this.alarmNoteRepository.getOne(alarmNote.getId());
        MyBeanCopy myBeanCopy = new MyBeanCopy();
        myBeanCopy.copyProperties(exist, alarmNote);
        return this.alarmNoteRepository.save(exist);
    }

    @Override
    public List<AlarmNote> findAllPageable(Pageable pageable) {
        return (List<AlarmNote>) this.alarmNoteRepository.findAll(pageable);
    }

    @Override
    public List<AlarmNote> findAll() {
        return this.alarmNoteRepository.findAll();
    }

    @Override
    @Transactional
    public List<AlarmNote> delete(AlarmNote alarmNote) {
        this.alarmNoteRepository.delete(alarmNote);
        return this.alarmNoteRepository.findAll();
    }

    @Override
    public AlarmNote findOne(AlarmNote alarmNote) {
        return this.alarmNoteRepository.getOne(alarmNote.getId());
    }

    @Override
    public AlarmNote findById(long id) {
        return this.alarmNoteRepository.getOne(id);
    }
}
