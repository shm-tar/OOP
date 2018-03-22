class Shell{
    public static void main(String[] args){

        int[] array = {30, 2, 10, 4, 6};
        int n = array.length;
        for(int i=0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println();

        shell(array);

    }
    public static void shell(int[] a) {
        int n = a.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
                    a[j] = a[j - gap];

                a[j] = temp;
            }
        }
    }
}
