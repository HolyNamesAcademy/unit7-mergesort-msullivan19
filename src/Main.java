import sun.plugin.javascript.navig.Array;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Use main to run and test the below functions
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses selection sort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void selectionSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("SelectionSort() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function searches linearly in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function uses binary search in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. THIS ARRAYLIST MUST BE
     *                  IN SORTED ORDER. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses MergeSort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void mergeSort(ArrayList<Integer> arrayList) {
        sort(arrayList,0,arrayList.size());
        merge(arrayList,0,arrayList.size()/2,arrayList.size());


    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function sorts the portion of arrayList specified by the range [lo, hi). The range
     * includes lo but excludes hi (arrayList[lo] is the first element in the range, but
     * arrayList[hi] is the first element after the last element in the range).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the range
     * @param hi the index of the last element in the range + 1.
     */
    public static void sort(ArrayList<Integer> arrayList, int lo, int hi) {
        if(hi- lo <=1)
            return;
        sort(arrayList,lo,(lo+hi)/2);
        sort(arrayList,(lo+hi)/2,hi);
        merge(arrayList,lo,(lo+hi)/2,hi);
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function merges two consecutive, sorted ranges in the arrayList into one sorted range. The ranges
     * are specified as [lo, mid) and [mid, hi). Each range includes the first element, but excludes
     * the last element (the same way as in sort()).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the first range
     * @param mid the boundary point of the two ranges. arrayList[mid] is in the second range.
     * @param hi the index of the last element in the second range + 1.
     */
    public static void merge(ArrayList<Integer> arrayList, int lo, int mid, int hi) {

        ArrayList <Integer> sorted = new ArrayList<>();
        sort(arrayList,lo,mid);
        sort(arrayList, mid, hi);

        for(int i= lo; i<mid; i++)
        {
            if(arrayList.get(i+1)< arrayList.get(i))
            {
                int temp = arrayList.get(i);
                arrayList.set(i,arrayList.get(i+1));
                arrayList.set(i+1, temp);

            }
        }
        for(int j= mid; j<hi; j++)
        {
            if(arrayList.get(j+1)< arrayList.get(j))
            {
                int temp = arrayList.get(j);
                arrayList.set(j,arrayList.get(j+1));
                arrayList.set(j+1, temp);

            }
        }
        for(int i=lo; i<mid; i++)
        {
            for(int j =mid; j<hi; j++)
            {
                if(arrayList.get(j)<arrayList.get(i))
                    sorted.add(arrayList.get(j));
                else
                {
                    sorted.add(arrayList.get(i));
                    break;
                }

            }
        }
    }
}
