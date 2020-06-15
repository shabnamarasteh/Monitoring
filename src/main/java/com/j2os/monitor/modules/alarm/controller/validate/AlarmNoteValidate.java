package com.j2os.monitor.modules.alarm.controller.validate;

import com.j2os.monitor.modules.alarm.model.entity.AlarmNote;
import com.j2os.monitor.modules.common.model.entity.ValidateObject;
import com.j2os.monitor.utils.Interfaces.validate.ValidateInterface;
import com.j2os.monitor.utils.annotation.ValidationAnnotation;

import java.util.List;
@ValidationAnnotation
public class AlarmNoteValidate implements ValidateInterface<AlarmNote> {
    @Override
    public ValidateObject addValidate(AlarmNote alarmNote) {
        return null;
    }

    @Override
    public ValidateObject updateValidate(AlarmNote alarmNote) {
        return null;
    }

    @Override
    public ValidateObject findAllValidate() {
        return null;
    }

    @Override
    public ValidateObject deleteValidate(AlarmNote alarmNote) {
        return null;
    }

    @Override
    public ValidateObject findOneValidate(AlarmNote alarmNote) {
        return null;
    }

    @Override
    public ValidateObject findByIdValidate(long id) {
        return null;
    }
}
