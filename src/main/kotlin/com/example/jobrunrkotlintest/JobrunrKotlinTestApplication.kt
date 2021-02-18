package com.example.jobrunrkotlintest

import org.jobrunr.configuration.JobRunr
import org.jobrunr.scheduling.JobScheduler
import org.jobrunr.scheduling.JobSchedulerExtensions.useKotlin
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.jobrunr.storage.sql.common.SqlStorageProviderFactory
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import javax.sql.DataSource


@SpringBootApplication
class JobrunrKotlinTestApplication

fun main(args: Array<String>) {
    runApplication<JobrunrKotlinTestApplication>(*args)
}

