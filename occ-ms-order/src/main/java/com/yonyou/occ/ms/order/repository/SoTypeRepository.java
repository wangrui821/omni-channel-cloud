package com.yonyou.occ.ms.order.repository;

import com.yonyou.occ.ms.order.domain.SoType;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the SoType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SoTypeRepository extends JpaRepository<SoType, Long> {

}
