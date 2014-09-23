package Lesson_5_class;

import java.util.*;
import java.util.stream.Collectors;

public class UserUtils {

//    merge  без дубликатов:
//    [1,5,4,23,65,32,78]
//    [3,5,24,54,1,2,34,45,32]
//    res:
//    [1,5,4,23,65,32,78, 3,24,54,2,34,45]
    public List<User> merge (List<User> left, List<User> right){
        if(left == null || left.size() == 0){
            return new ArrayList<>();
        }else if(right == null || right.size() == 0){
            return left;
        }else {
            right.removeIf((u) -> left.contains(u));
            right.stream().distinct().collect(Collectors.toList());
            ArrayList<User> result = new ArrayList<User>();
            result.addAll(left);
            result.addAll(right);
            return result;


//            Вместо:
//            ArrayList<User> result = new ArrayList<User>();
//            result.addAll(left);
//            HashSet<User> temp0 = new HashSet<User>();
//            for (int i = 0; i < right.size(); i++) {
//                if(!(left.contains(right.get(i)))){
//                    temp0.add(right.get(i));
//                }
//            }
//            result.addAll(temp0);
//            return result;

        }
    }



//    inner union (обеднение общих элементов)
//    [1,5,4,23,65,32,78]
//    [3,5,24,4,1,2,34,45,32,5]
//    res:
//    [5,4,32,1]
    public List<User> innerUnion (List<User> left, List<User> right) {
        if(left == null || right == null){
            return new ArrayList<>();
        }else {
            right.removeIf((u) -> !left.contains(u));
            right.stream().distinct().collect(Collectors.toList());
            return right;


//            Вместо:
//            ArrayList<User> result = new ArrayList<User>();
//            HashSet<User> temp = new HashSet<User>();
//            for (User user : right) {
//                if(left.contains(user)){
//                    temp.add(user);
//                }
//            }
//            result.addAll(temp);
//            return result;
        }
        }



//    outer union (Вывод разных отличающихся элементов):
//    [1,5,4,23,65,32,78]
//    [3,5,24,4,1,2,34,45,32,5]
//    res:
//    [23,65,78,3,24,2,34,45]
    public List<User> outerUnion (List<User> left, List<User> right){
        if (left == null || right == null){
            return new ArrayList<>();
        }else if(left.size() == 0) {
            return right;
        }else if(right.size() == 0) {
            return left;
        }else{
            List<User> result = new ArrayList<>();
            List<User> list0 = left.stream().filter(u -> !right.contains(u)).collect(Collectors.toList());
            List<User> list1 = right.stream().filter(u -> !left.contains(u)).collect(Collectors.toList());
            result.addAll(list0);
            result.addAll(list1);
            return result;


//            Вместо:
//            ArrayList<User> result = new ArrayList<User>();
//            for (int i = 0; i < right.size(); i++) {
//                if(!(left.contains(right.get(i)))){
//                    result.add(right.get(i));
//                }
//            }
//            for (int i = 0; i < left.size(); i++) {
//                if(!(right.contains(left.get(i)))){
//                    result.add(left.get(i));
//                }
//            }
//            return result;
        }
    }
    }



