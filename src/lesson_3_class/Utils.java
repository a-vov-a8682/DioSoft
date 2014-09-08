package lesson_3_class;

public class Utils {

    private static boolean isInArray(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int[] leftUnion(int[] left, int[] right) {
        if(left == null){
            return new int[0];
        }else if (right == null){
            return left;
        }else {
            int[] temp = new int[left.length + right.length];
            int count = left.length;

            for (int i = 0; i < left.length; i++) {
                temp[i] = left[i];
            }

            for (int i = 0; i < right.length; i++) {
                for (int j = 0; j < left.length; j++) {
                    if (right[i] == left[j]) {
                        temp[count++] = right[i];
                    }
                }
            }

            int[] result = new int[count];
            System.arraycopy(temp, 0, result, 0, result.length);
            return result;
        }
    }
    public static int[] innerUnion (int[] left, int[] right){
        if(left == null || right == null ||
                left.length == 0 || right.length == 0){
            return new int[0];
        }else {
            int[] temp = new int[left.length + right.length];
            int count = 0;
            for (int i = 0; i < right.length; i++) {
                for (int j = 0; j < left.length; j++) {
                    if (right[i] == left[j]) {
                        temp[count++] = right[i];
                    }
                }
            }
            int[] temp0 = new int[count];
            System.arraycopy(temp, 0, temp0, 0, count);

            int[] temp1 = new int[temp0.length];
            int countElem = 0;
            for (int i = 0; i < temp0.length; i++) {
                if(!(isInArray(temp1, temp0[i]))){
                    temp1[countElem++] = temp0[i];
                }
            }

            int[] result = new int[countElem];
            System.arraycopy(temp1, 0, result, 0, countElem);
            return result;
        }
    }
    public static int[] outerUnion (int[]left, int[] right){
        if(left == null || right == null){
            return new int[0];
        } else if(left.length == 0) {
            return right;
        } else if (right.length == 0) {
            return left;
        }else {
            int[] temp = new int[left.length + right.length];
            int count = 0;

            int i = 0;
            while (i < left.length) {
                if (!(isInArray(right, left[i]))) {
                    temp[count++] = left[i];
                }
                i++;
            }
            int j = 0;
            while (j < right.length) {
                if (!(isInArray(left, right[j]))) {
                    temp[count++] = right[j];
                }
                j++;
            }
            int[] result = new int[count];
            System.arraycopy(temp, 0, result, 0, result.length);
            return result;
        }
    }
    public static int[] merge (int[] left, int[] right){
        if(left == null || left.length == 0){
            return new int[0];
        } else if(right == null || right.length == 0) {
            return left;
        } else {
            int[] preResult = new int[left.length + right.length];
            for (int i = 0; i < left.length; i++) {
                preResult[i] = left[i];
            }

            int[] rightWithDubs = new int[right.length];
            int rightTempLength = 0;
            for (int i = 0; i < right.length; i++) {
                if(!(isInArray(left, right[i]))){
                    rightWithDubs[rightTempLength++] = right[i];
                }
            }

            int[] rightWithDubsCuted = new int[rightTempLength];
            System.arraycopy(rightWithDubs, 0, rightWithDubsCuted, 0, rightTempLength);

            int[] rightWithoutDubs = new int[rightTempLength];
            int rightTempCount = 0;
            for (int i = 0; i < rightWithDubsCuted.length; i++) {
                if(!(isInArray(rightWithoutDubs, rightWithDubsCuted[i]))){
                    rightWithoutDubs[rightTempCount++] = rightWithDubsCuted[i];
                }
            }
            System.arraycopy(rightWithoutDubs, 0 , preResult, left.length, rightTempCount);

            int[] result = new int[left.length + rightTempCount];
            System.arraycopy(preResult, 0, result, 0, result.length);
            return result;
        }
    }
}
