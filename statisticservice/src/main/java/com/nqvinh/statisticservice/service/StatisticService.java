package com.nqvinh.statisticservice.service;

import java.util.List;

import com.nqvinh.statisticservice.model.StatisticDTO;

public interface StatisticService {
    void add(StatisticDTO statisticDTO);

    List<StatisticDTO> getAll();
}

