package tech.felixpanzo.poi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.felixpanzo.poi.entity.PoitOfInterest;

public interface PointOfInterestRepository extends JpaRepository<PoitOfInterest, Long> {
}
