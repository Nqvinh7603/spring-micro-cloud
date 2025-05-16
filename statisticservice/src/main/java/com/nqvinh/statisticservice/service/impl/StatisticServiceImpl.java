package com.nqvinh.statisticservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nqvinh.statisticservice.entity.Statistic;
import com.nqvinh.statisticservice.model.StatisticDTO;
import com.nqvinh.statisticservice.repository.StatisticRepository;
import com.nqvinh.statisticservice.service.StatisticService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class StatisticServiceImpl implements StatisticService {
    @Autowired
    StatisticRepository statisticRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void add(StatisticDTO statisticDTO) {
        Statistic statistic = modelMapper.map(statisticDTO, Statistic.class);
        statisticRepository.save(statistic);
    }

    @Override
    public List<StatisticDTO> getAll() {
        List<StatisticDTO> statisticDTOs = new ArrayList<>();

        statisticRepository.findAll().forEach((statistic) -> {
            statisticDTOs.add(modelMapper.map(statistic, StatisticDTO.class));
        });

        return statisticDTOs;
    }
}
