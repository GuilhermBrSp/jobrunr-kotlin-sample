package com.example.jobrunrkotlintest

import org.springframework.stereotype.Component

@Component
class BeanJob {

    fun executeJob() = println("Job executed with instance injection")

}