package com.lizb.portfolio.domain.repository

import com.lizb.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {


}