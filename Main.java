public class Main {
    public static void main(String[] args) {
        
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        //dynamicArray.insert(0, "x");
        //dynamicArray.delete("A");
        //System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size+" Sizeee");
        System.out.println(dynamicArray.capacity+" capacity");
        System.out.println(dynamicArray.isEmpty());
    }
}
