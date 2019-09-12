package crm.api.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedService {

    @Autowired
    private FeedRepository feedRepository;

    public List<FeedModel> getAllFeeds() {
        List<FeedModel> feeds = new ArrayList<>();
        feedRepository.findAll().forEach(feeds::add);
        return feeds;
    }

    public void addFeed(FeedModel feedModel) {

        feedRepository.save(feedModel);
    }

    public FeedModel getFeed(int id)
    {
        return feedRepository.findById(id).get();
    }
    public void updateFeed(int id, FeedModel feedModel){

        feedRepository.save(feedModel);
    }

    public List<FeedModel> getUserFeed(int userId){
        List<FeedModel> feeds = new ArrayList<>();
        feedRepository.findByUserModelId(userId).forEach(feeds::add);
        return feeds;
    }

    public void deleteFeed(int id) {

        feedRepository.deleteById(id);
    }
}
