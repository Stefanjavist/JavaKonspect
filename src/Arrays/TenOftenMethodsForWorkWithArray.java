package Arrays;


public class TenOftenMethodsForWorkWithArray {
   /**0. Объявление массива
    String[] aArray = new String[5];
    String[] bArray = {"a","b","c", "d", "e"};
    String[] cArray = new String[]{"a","b","c","d","e"};

    1. Вывод массива в Java
    int[] intArray = { 1, 2, 3, 4, 5 };
    String intArrayString = Arrays.toString(intArray);

// print directly will print reference value
System.out.println(intArray);
// [I@7150bd4d

System.out.println(intArrayString);
// [1, 2, 3, 4, 5]

    2. Создание ArrayList из массива
    String[] stringArray = { "a", "b", "c", "d", "e" };
    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
System.out.println(arrayList);
// [a, b, c, d, e]

    3. Проверка массива на наличие конкретного значения
    String[] stringArray = { "a", "b", "c", "d", "e" };
    boolean b = Arrays.asList(stringArray).contains("a");
System.out.println(b);
// true

    4. Объединение двух массивов
    int[] intArray = { 1, 2, 3, 4, 5 };
    int[] intArray2 = { 6, 7, 8, 9, 10 };
    // Apache Commons Lang library
    int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);

    5. Объявление массива в одной строке
    method(new String[]{"a", "b", "c", "d", "e"});

    6. Объединение элементов массива в строку
    // containing the provided list of elements
// Apache common lang
    String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
System.out.println(j);
// a, b, c

    7. Преобразование ArrayList в массив
    String[] stringArray = { "a", "b", "c", "d", "e" };
    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
    String[] stringArr = new String[arrayList.size()];
arrayList.toArray(stringArr);
for (String s : stringArr)
            System.out.println(s);

    8. Преобразование массива во множество (Set)
    Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
System.out.println(set);
//[d, e, b, c, a]

    9. Возврат массива с элементами в обратном порядке
    int[] intArray = { 1, 2, 3, 4, 5 };
ArrayUtils.reverse(intArray);
System.out.println(Arrays.toString(intArray));
//[5, 4, 3, 2, 1]

    10. Удаление элемента из массива
    int[] intArray = { 1, 2, 3, 4, 5 };
    int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
System.out.println(Arrays.toString(removed));
*/
}
