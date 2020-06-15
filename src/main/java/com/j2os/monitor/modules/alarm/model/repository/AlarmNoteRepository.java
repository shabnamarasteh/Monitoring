package com.j2os.monitor.modules.alarm.model.repository;

import com.j2os.monitor.modules.alarm.model.entity.AlarmNote;
import com.j2os.monitor.utils.Interfaces.repository.RepositoryInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmNoteRepository extends JpaRepository<AlarmNote, Long>, RepositoryInterface {
}
