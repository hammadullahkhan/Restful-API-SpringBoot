package com.in28minutues.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Component
public class UserDaoService {
    private List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    UserDaoService(){
        users.add( new User(1, "Kamran",    new Date()));
        users.add( new User(2, "Adam",    new Date()));
        users.add( new User(3, "Hammad",    new Date()));

    }

  /**  static{
                users.add( new User(1, "Kamran",    new Date()));
                users.add( new User(2, "Adam",    new Date()));
                users.add( new User(3, "Hammad",    new Date()));
            }*/

          public List<User> findAll() {
                return users;
            }

            public User save(User user) {
                if (user.getId() == null) {
                    user.setId(++usersCount);
                }
                users.add(user);
                return user;
            }

   /**         public User findOne( int  id ) {
                for(User user : users){
                    if(user.getId() == id) {
                        return user;
                    }
                }
                retrun null;
            }*/

}
