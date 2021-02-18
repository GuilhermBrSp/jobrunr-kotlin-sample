package com.example.jobrunrkotlintest

import org.jobrunr.jobs.JobId
import org.jobrunr.jobs.lambdas.IocJobLambda
import org.jobrunr.scheduling.JobScheduler
import org.jobrunr.scheduling.KtBackgroundJob
import org.jobrunr.scheduling.KtJobScheduler
import org.springframework.stereotype.Component
import org.jobrunr.scheduling.BackgroundJob

import java.util.UUID




class KotlinJobRunner(
    private val jobScheduler: JobScheduler
) {

    fun enqueueSimpleJob(): JobId {
        val ktJobScheduler = KtJobScheduler(jobScheduler)
        return ktJobScheduler.enqueue { println("simpleJob executed") }
    }

    fun enqueueJobWithInstanceInjection(): JobId {
        val ktJobScheduler = KtJobScheduler(jobScheduler)
        return ktJobScheduler.enqueue<BeanJob> { x: BeanJob -> x.executeJob() }
    }


}