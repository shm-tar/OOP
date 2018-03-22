class Shell{
public static void main(String[] args){

int[] array = {30, 2, 10, 4, 6};
for(int i=0; i < array.length; i++){
	System.out.print(array[i]);
	System.out.print(' ');
}
System.out.println();

shell(array);

}
public static void shell(int[] a) {
	int increment = a.length / 2;
	while (increment > 0) {
		for (int i = increment; i < a.length; i++) {
			int j = i;
			int temp = a[i];
			while (j >= increment && a[j - increment] > temp) {
				a[j] = a[j - increment];
				j = j - increment;
			}
			a[j] = temp;
		}
		if (increment == 2) {
			increment = 1;
		} else {
			increment *= (5.0 / 11);
		}
	}
	for(int i=0; i < a.length; i++){
		System.out.print(a[i]);
		System.out.print(' ');
	}
}
}
