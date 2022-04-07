package callengineer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="paymentInformations", path="paymentInformations")
public interface PaymentInformationRepository extends PagingAndSortingRepository<PaymentInformation, Long>{


}
