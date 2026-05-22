//package com.fridgeapp.controller;
//
//import com.fridgeapp.entity.ActivityLog;
//import com.fridgeapp.service.ActivityLogService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/activity-logs")
//public class ActivityLogController {
//
//    private final ActivityLogService activityLogService;
//
//    public ActivityLogController(ActivityLogService activityLogService) {
//        this.activityLogService = activityLogService;
//    }
//
//    @PostMapping
//    public ResponseEntity<ActivityLog> createLog(@RequestBody ActivityLog log) {
//        ActivityLog saved = activityLogService.save(log);
//        return new ResponseEntity<>(saved, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ActivityLog>> getAllLogs() {
//        return ResponseEntity.ok(activityLogService.findAll());
//    }
//}