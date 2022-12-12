package com.group5.repository;

import com.group5.Model.HouseListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.group5.Model.ImageFile;

@Repository
public interface ImageFileRepository extends JpaRepository<ImageFile,Long> {
public ImageFile findFirstByHouseListing(HouseListing houseListing);
 public void deleteAllByHouseListing(HouseListing listing);
}
