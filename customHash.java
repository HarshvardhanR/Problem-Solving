public class customHash {
    public static void main(String args[]) {
        hash h1 = new hash();
        h1.put(2, 20);
        h1.put(1, 10);
        h1.put(4, 40);
        h1.put(3, 30);
        System.out.println(h1.get(3));
    }
}

class hash {
    int length;
    int keyArr[];
    int valueArr[];
    float lf = 0.75f;

    public hash() {
        length = 0;
        keyArr = new int[3];
        valueArr = new int[3];
    }

    public void put(int key, int value) {
        if (length > (keyArr.length * lf)) {
            resizeArray();
        }
        keyArr[length] = key;
        valueArr[length] = value;
        length++;
    }

    public int get(int key) {
        for (int i = 0; i < keyArr.length; i++) {
            if (key == keyArr[i]) {
                return valueArr[i];
            }
        }
        return -1;
    }

    public void resizeArray() {
        int newSize = (keyArr.length) * 2;
        int newKeyArr[] = new int[newSize];
        int newvalueArr[] = new int[newSize];

        for (int i = 0; i < keyArr.length; i++) {
            newKeyArr[i] = keyArr[i];
            newvalueArr[i] = valueArr[i];
        }

        keyArr = newKeyArr;
        valueArr = newvalueArr;
    }
}