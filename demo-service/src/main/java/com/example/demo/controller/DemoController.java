package com.mci.schedule.controller;

import com.mci.schedule.payload.BaseResponse;
import com.mci.schedule.service.ScheduleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Demo", description = "Demo")
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("${api.prefix}/demo")
public class ScheduleController {

    @GetMapping("demo")
    public ResponseEntity<Object> demo(
    ){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}
