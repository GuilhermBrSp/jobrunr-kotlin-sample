package com.example.jobrunrkotlintest

import org.jobrunr.jobs.JobId
import org.jobrunr.scheduling.JobScheduler
import org.jobrunr.scheduling.KtBackgroundJob
import org.jobrunr.scheduling.KtJobScheduler
import org.springframework.stereotype.Component

class KotlinJobRunner(
    private val jobScheduler: JobScheduler
) {

    fun enqueueJob(): JobId {
        val ktJobScheduler = KtJobScheduler(jobScheduler)
        return ktJobScheduler.enqueue { println("test") }
    }
}