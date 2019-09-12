package crm.api.feed;

import crm.api.user.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedController {

    @Autowired
    private FeedService feedService;


    @RequestMapping("/feeds")
    public List<FeedModel> getAllFeeds(){
        return feedService.getAllFeeds();
    }
    @RequestMapping("/feed/{id}")
    public FeedModel getFeed(@PathVariable int id){
        return feedService.getFeed(id);
    }

    @RequestMapping("/timeline/{userId}")
    public List<FeedModel> getUserFeed(@PathVariable int userId){
        return feedService.getUserFeed(userId);
    }

    @RequestMapping(method=RequestMethod.POST, value="add/feed/{userId}")
    public void addFeed (@RequestBody FeedModel feedModel, @PathVariable int userId) {
        feedModel.setUserModel(new UserModel(userId,"","","","","","","","","","","",""));
        feedService.addFeed(feedModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/feed/{id}/{userId}")
    public void updateFeed(@RequestBody FeedModel feedModel, @PathVariable int id, @PathVariable int userId){
        feedModel.setUserModel(new UserModel(userId,"","","","","","","","","","","",""));
        feedService.updateFeed(id, feedModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/feed/{id}")
    public void deleteFeed(@PathVariable int id){
        feedService.deleteFeed(id);
    }
}
