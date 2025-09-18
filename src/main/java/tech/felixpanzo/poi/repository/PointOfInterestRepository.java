package tech.felixpanzo.poi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.felixpanzo.poi.entity.PointOfInterest;

public interface PointOfInterestRepository extends JpaRepository<PointOfInterest, Long> {
}
