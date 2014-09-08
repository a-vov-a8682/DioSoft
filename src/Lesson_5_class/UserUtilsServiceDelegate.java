package Lesson_5_class;

import java.util.List;

public class UserUtilsServiceDelegate {
    
    private final UserUtils resource;

    public UserUtilsServiceDelegate(UserUtils resource){
        this.resource = resource;
    }

    public List<User> merge (List<User> list0, List<User> list1){
        //Kak bit` s null ?
       // System.out.println(Arrays.toString(list0.toArray()));
     //   System.out.println(Arrays.toString(list1.toArray()));
        List<User> result = resource.merge(list0, list1);
       // System.out.println(result.toString());
        return result;
    }
    public List<User> innerUnion (List<User> list0, List<User> list1){
//        System.out.println(list0.toString());
     //   System.out.println(list1.toString());
        List<User> result = resource.innerUnion(list0, list1);
      //  System.out.println(result.toString());
        return result;
    }
    public List<User> outerUnion (List<User> list0, List<User> list1){
       // System.out.println(list0.toString());
       // System.out.println(list1.toString());
        List<User> result = resource.outerUnion(list0, list1);
    //    System.out.println(result.toString());
        return result;
    }
}
