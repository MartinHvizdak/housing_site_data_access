package com.group5.repository;

import com.group5.Model.HouseListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseListingRepository extends JpaRepository<HouseListing,Long> {
}
