package com.j2os.monitor.modules.device.model.entity;

import javax.persistence.*;

@Table
@Entity
public class DeviceModel {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="device_model_seq")
    @SequenceGenerator(name="device_model_seq", sequenceName="device_model_seq", allocationSize=1)
    private long id;

    @Column(columnDefinition = "varchar2(200)")
    private String name;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;



}
