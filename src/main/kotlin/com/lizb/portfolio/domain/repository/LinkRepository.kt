package com.lizb.portfolio.domain.repository

import com.lizb.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {


}