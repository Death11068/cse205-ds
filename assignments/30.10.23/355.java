class Twitter {

    HashMap<Integer,Set<Integer>>following;
    HashMap<Integer,Set<Integer>>followers;
    HashMap<Integer,LinkedList<Pair<Integer,Integer>>>mp;
    HashMap<Integer,Integer>time;
    HashMap<Integer,Integer>time2;
    int clock=0;

    public Twitter() {

    followers=new HashMap<>();
    following=new HashMap<>();
    mp=new HashMap<>();
    time=new HashMap<>();
    time2=new HashMap<>();

    }
    
    public void postTweet(int userId, int tweetId) {
        
    if(!mp.containsKey(userId)){

    mp.put(userId,new LinkedList<Pair<Integer,Integer>>());

    }

    mp.get(userId).addFirst(new Pair<Integer,Integer>(tweetId,userId));

    if(followers.containsKey(userId)){

    for(int m:followers.get(userId)){

    mp.get(m).addFirst(new Pair<Integer,Integer>(tweetId,userId));

    }

    }

    time.put(tweetId,clock);

    time2.put(clock,tweetId);

    clock++;

    }
    
    public List<Integer> getNewsFeed(int userId) {

    List<Integer>ans=new ArrayList<Integer>();

    List<Integer>temp=new ArrayList<Integer>();

    if(!mp.containsKey(userId))return ans;

    for(Pair<Integer,Integer>p:mp.get(userId)){

    if(p.getValue()==userId||following.get(userId).contains(p.getValue())){

    temp.add(time.get(p.getKey()));

    }

    }

    Collections.sort(temp);

    int count=0;

    for(int i=temp.size()-1;i>=0&&count<10;i--,count++){

    ans.add(time2.get(temp.get(i)));

    }

    return ans;
        
    }
    
    public void follow(int followerId, int followeeId) {

    if(following.containsKey(followerId)&&following.get(followerId).contains(followeeId))return;


    if(!following.containsKey(followerId)){

    following.put(followerId,new HashSet<Integer>());

    }

    following.get(followerId).add(followeeId);

    if(!followers.containsKey(followeeId)){

    followers.put(followeeId,new HashSet<Integer>());

    }

    followers.get(followeeId).add(followerId);


    if(!mp.containsKey(followerId)){

    mp.put(followerId,new LinkedList<Pair<Integer,Integer>>());
    
    }

    if(mp.containsKey(followeeId)){

      Iterator<Pair<Integer,Integer>>iterator = mp.get(followeeId).descendingIterator();

      while (iterator.hasNext()) 
        {
        
        Pair<Integer,Integer>p=iterator.next();

        if(p.getValue()==followeeId){

    mp.get(followerId).addFirst(new Pair<Integer,Integer>(p.getKey(),p.getValue()));

    }

        }
    }

    }
    
    public void unfollow(int followerId, int followeeId) {
        
    if(following.containsKey(followerId))
    following.get(followerId).remove(followeeId);
    

    if(followers.containsKey(followeeId))
    followers.get(followeeId).remove(followerId);

    }
}


/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */