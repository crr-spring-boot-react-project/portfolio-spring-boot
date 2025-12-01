package com.lizb.portfolio.domain.repository

import com.lizb.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Experience>

//    override fun findById(id: Long): Optional<Experience>
}