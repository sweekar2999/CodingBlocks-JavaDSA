package Oops;

//A generic class that store any type of object
class Box<T> {
 T item;

 // Constructor
 Box(T item) {
     this.item = item;
 }

 // Getter method
 public T getItem() {
     return item;
 }
 public static <T> void print(T arr[]) {
	 for(int i=0;i<arr.length;i++) {
		 System.out.println(arr[i]);
	 }
 }

 public static void main(String[] args) {
     // Create a Box for String
     Box<String> stringBox = new Box<>("Hello");

     // Create a Box for Integer
     Box<Integer> intBox = new Box<>(123);

     System.out.println("String in box: " + stringBox.getItem());
     System.out.println("Integer in box: " + intBox.getItem());
     
     // Array of integers
     Integer[] intArray = {1, 2, 3, 4, 5};
     // Array of strings
     String[] strArray = {"Hello", "World"};

     // Calling generic method
     intBox.print(intArray);
     stringBox.print(strArray);
 }
}
