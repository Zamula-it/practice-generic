package org.itstep;
import java.util.Arrays;
class List<Te extends Comparable<Te>> {
    private Te[] arr;
    @SuppressWarnings( "нен проверенно " )
    public List() {
        this.arr = (Te[]) new Comparable[0];
    }
    public void add(Te tea) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = tea;
    }
    public Te GetTMP(int tmp) {
        return arr[tmp];
    }
    public Te min() {
        Te min = arr[0];
        for(Te tea: arr) {
            if(tea.compareTo( min ) < 0) {
                min = tea;
            }
        }
        return min;
    }
    public Te max() {
        Te max = arr[0];
        for(Te tea: arr) {
            if(tea.compareTo( max ) > 0) {
                max = tea;
            }
        }
        return max;
    }
}