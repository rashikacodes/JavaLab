class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};   // size = 4

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
    }
}