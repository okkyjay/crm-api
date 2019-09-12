package crm.api.feed;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedRepository extends CrudRepository<FeedModel, Integer> {
    public List<FeedModel> findByUserModelId(int userId);
}
