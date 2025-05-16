package com.nqvinh.statisticservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nqvinh.statisticservice.entity.Statistic;


public interface StatisticRepository extends JpaRepository<Statistic, Long> {

}
