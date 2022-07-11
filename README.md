# springboot-redis-cache 
Redis means REmote DIctionary Server. It is inmemory data structure store which supports different data structure like Strings, Hashes, List, Set and Sorted Set etc. Redis is key value database. 
Redis can be used as database, cache and message broker. It has built in replication , LRU eviction , transactions, disk level persistence.

### To install the redis in windows:

1. Download .Zip Or .Msi File.
    > Go to https://github.com/microsoftarchive/redis/releases to Download .zip or .msi file.

2. Using zip file. Extract the zip file.

3. Add redis path to windows environment variable.

4. Install Redis on windows service using command prompt from redis folder
   > redis-server --service-install
   
   To uninstall the redis from window service
   > redis-server --service-uninstall
   
5. To run redis on windows. Open command prompt and type
    > redis-server --service-start
   
    To save and stop the redis database type
    > redis-server shutdown save
   
    To shut down the redis server type
    > redis-server --service-stop

6. To test the path has been successfully added or not open the Command Prompt and write command:
    > redis-server

7. Open the command prompt  type:
    > redis-cli
   


* Once we run the application and the data is stored in redis cache. We can check the redis cache using `redis-cli` command in command prompt.When the redis cli started we can check key using command we will get all keys.
  > keys
* To get the value of the key:
    > get "springRedisbooks::2"
  
* The `keys *` value will be null after 1 minute because we have set the value to store for only 60000 milliseconds in `application.yaml`.
