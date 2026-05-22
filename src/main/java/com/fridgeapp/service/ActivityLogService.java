//package com.fridgeapp.service;
//
//import com.fridgeapp.entity.ActivityLog;
//import com.fridgeapp.repository.ActivityLogRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class ActivityLogService {
//
//    private final ActivityLogRepository activityLogRepository;
//
//    public ActivityLogService(ActivityLogRepository activityLogRepository) {
//        this.activityLogRepository = activityLogRepository;
//    }
//
//    public ActivityLog save(ActivityLog log) {
//        return activityLogRepository.save(log);
//    }
//
//    public List<ActivityLog> findAll() {
//        return activityLogRepository.findAll();
//    }
//}