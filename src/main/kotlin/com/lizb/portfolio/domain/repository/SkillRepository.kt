package com.lizb.portfolio.domain.repository

import com.lizb.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {


}