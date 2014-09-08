package lesson_3;

public class UserUtils {

    private static boolean isInUserArray(User[] array, User target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                return false;
            }else if(array[i].equals(target)){
                return true;
            }
        }
        return false;
    }

    public static User[] merge (User[] left, User[] right){
        if(left == null || left.length == 0){
            return new User[0];
        }else if(right == null){
            return left;
        }else {
            User[] preResult = new User[left.length + right.length];
            for (int i = 0; i < left.length; i++) {
                preResult[i] = left[i];
            }

            User[] rightWithDubs = new User[right.length];
            int rightTempLength = 0;
            for (int i = 0; i < right.length; i++) {
                if(!(isInUserArray(left, right[i]))) {
                    rightWithDubs[rightTempLength++] = right[i];
                }
            }

            User[] rightWithDubsCuted = new User[rightTempLength];
            System.arraycopy(rightWithDubs, 0, rightWithDubsCuted, 0, rightTempLength);

            User[] rightWithoutDubs = new User[rightTempLength];
            int rightTempCount = 0;
            for (int i = 0; i < rightWithDubsCuted.length; i++) {
                if(!(isInUserArray(rightWithoutDubs, rightWithDubsCuted[i]))){
                    rightWithoutDubs[rightTempCount++] = rightWithDubsCuted[i];
                }
            }
            System.arraycopy(rightWithoutDubs, 0 , preResult, left.length, rightTempCount);

            User[] result = new User[left.length + rightTempCount];
            System.arraycopy(preResult, 0, result, 0, result.length);
            return result;
        }
    }
    public static User[] innerUnion (User[] left, User[] right) {
        if(left == null || right == null){
            return new User[0];
        }else {
            User[] temp = new User[left.length + right.length];
            int count = 0;
            for (int i = 0; i < left.length; i++) {
                for (int j = 0; j < right.length; j++) {
                    if (left[i].equals(right[j])){
                        temp[count++] = left[i];
                    }
                }
            }
            User[] temp0 = new User[count];
            System.arraycopy(temp, 0, temp0, 0, count);

            User[] temp1 = new User[temp0.length];
            int countElem = 0;
            for (int i = 0; i < temp0.length; i++) {
                if (!(isInUserArray(temp1, temp0[i]))) {
                    temp1[countElem++] = temp0[i];
                }
            }

            User[] result = new User[countElem];
            System.arraycopy(temp1, 0, result, 0, countElem);
            return result;
        }
        }
    public static User[] outerUnion (User[] leftArray, User[] rightArray){
        if (leftArray == null || rightArray == null){
            return new User[0];
        }else if(leftArray.length == 0) {
            return rightArray;
        }else if(rightArray.length == 0) {
            return leftArray;
        }else{

            User[] temp = new User[leftArray.length + rightArray.length];
            int resultLength = 0;

            int i = 0;
            while (i < leftArray.length) {
                if (!(isInUserArray(rightArray, leftArray[i]))) {
                    temp[resultLength++] = leftArray[i];
                }
                i++;
            }
            int j = 0;
            while (j < rightArray.length) {
                if (!(isInUserArray(leftArray, rightArray[j]))) {
                    temp[resultLength++] = rightArray[j];
                }
                j++;
            }

            User[] result = new User[resultLength];
            System.arraycopy(temp, 0, result, 0, resultLength);
            return result;
        }
    }
    }



