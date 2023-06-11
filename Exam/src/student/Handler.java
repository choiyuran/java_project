package student;

import java.util.Arrays;
import java.util.Comparator;

public class Handler {
	Student[] arr = new Student[10];
	Object[] compArray = new Object[4];
	
	public Handler() {
		Comparator<Student> comp1 = (a,b) -> a != null && b != null ? a.getName().compareTo(b.getName()) : 0;
		Comparator<Student> comp2 = (a,b) -> a != null && b != null ? b.getName().compareTo(a.getName()) : 0;
		Comparator<Student> comp3 = (a,b) -> a != null && b != null ? a.getSum() - b.getSum() : 0;
		Comparator<Student> comp4 = (a,b) -> a != null && b != null ? b.getSum() - a.getSum() : 0;
		compArray[0] = comp1;
		compArray[1] = comp2;
		compArray[2] = comp3;
		compArray[3] = comp4;
		
	}
	
	

	public Student[] selectAll() {
		return arr;
	}

	public int insert(Student tmp) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = tmp;
				row += 1;
				break;
			}
		}
		return row;
	}

	public Student[] search(String keyword) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().contains(keyword)) {
				count++;
			}
		}
		
		Student[] searchArr = new Student[count];
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			if(arr[i] != null && s.getName().contains(keyword)) {
				searchArr[count++] = arr[i]; 
			}
		}
		return searchArr;
	}

	public int delete(String keyword) {
		int row = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(keyword)) {
				arr[i] = null;
				row += 1;
			}
		}
		return row;
	}

	@SuppressWarnings("unchecked")
	public Student[] sort(int option) {
//		Arrays.sort(arr, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student a, Student b) {
//				if(a != null && b != null) {
//					return a.getName().compareTo(b.getName());
//				}
//				return 0;
//			}
//		});
		
//		Arrays.sort(arr, (a,b) -> a != null && b != null ? b.getName().compareTo(a.getName()) : 0);
		
		if(0 <= option && option < compArray.length) {
			Arrays.sort(arr, (Comparator<Student>)compArray[option]);
		}
		return arr;
	}
	
	
	
	
}
