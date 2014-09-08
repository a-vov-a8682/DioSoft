package Lesson_5_class;

import java.util.*;

public class UserUtils {

    public List<User> merge (List<User> left, List<User> right){
        if(left == null || left.size() == 0){
            return new ArrayList<User>();
        }else if(right == null){
            return left;
        }else {
            ArrayList<User> result = new ArrayList<User>();
            result.addAll(left);
            HashSet<User> temp0 = new HashSet<User>();
            for (int i = 0; i < right.size(); i++) {
                if(!(left.contains(right.get(i)))){
                    temp0.add(right.get(i));
                }
            }
            result.addAll(temp0);
            return result;
        }
    }
    public List<User> innerUnion (List<User> left, List<User> right) {
        if(left == null || right == null){
            return new ArrayList<User>();
        }else {
            ArrayList<User> result = new ArrayList<User>();
            HashSet<User> temp = new HashSet<User>();
            for (int i = 0; i < right.size(); i++) {
                if(left.contains(right.get(i))){
                    temp.add(right.get(i));
                }
            }
            result.addAll(temp);
            return result;
        }
        }
    public List<User> outerUnion (List<User> left, List<User> right){
        if (left == null || right == null){
            return new ArrayList<User>();
        }else if(left.size() == 0) {
            return right;
        }else if(right.size() == 0) {
            return left;
        }else{
            ArrayList<User> result = new ArrayList<User>();
            for (int i = 0; i < right.size(); i++) {
                if(!(left.contains(right.get(i)))){
                    result.add(right.get(i));
                }
            }
            for (int i = 0; i < left.size(); i++) {
                if(!(right.contains(left.get(i)))){
                    result.add(left.get(i));
                }
            }
            return result;
        }
    }
    }



