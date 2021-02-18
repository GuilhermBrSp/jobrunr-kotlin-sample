package com.example.jobrunrkotlintest

import org.jobrunr.scheduling.JobScheduler
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/jobs")
class TestController(
    val jobScheduler: JobScheduler
){

    @PostMapping("start-background-job-with-kotlin")
    fun startBackgroundJobWithKotlin(): ResponseEntity<String> {
        KotlinJobRunner(jobScheduler).enqueueSimpleJob()
        KotlinJobRunner(jobScheduler).enqueueJobWithInstanceInjection()
        return ResponseEntity.ok("Ok")
    }

    @PostMapping("start-background-job-with-java")
    fun startBackgroundJobWithJava(): ResponseEntity<String> {
        val id = JavaJobRunner(jobScheduler).enqueueJob()
        return ResponseEntity.ok(id.toString())
    }




}
