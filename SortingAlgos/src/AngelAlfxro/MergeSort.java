//package AngelAlfxro;
import AngelAlfxro.tvShows;

import java.util.List;
import java.util.Arrays;

public class MergeSort {
    void merge(tvShows arr[], int l, int m, int r, String type) {


        int n1 = m - l + 1;

        int n2 = r - m;

        tvShows L[] = new tvShows[n1];

        tvShows R[] = new tvShows[n2];


        for (int i = 0; i < n1; ++i)

            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)

            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;


        int k = l;

        while (i < n1 && j < n2) {

            boolean cond = type.equals("Network") ? L[i].getNetwork().compareTo(R[j].getNetwork()) < 0

                    : L[i].getNumEpisodes() <= R[j].getNumEpisodes();

            if (cond) {

                arr[k] = L[i];

                i++;

            } else {

                arr[k] = R[j];

                j++;

            }

            k++;

        }


        while (i < n1) {

            arr[k] = L[i];

            i++;

            k++;

        }


        while (j < n2) {

            arr[k] = R[j];

            j++;

            k++;

        }

    }



    void sort(tvShows arr[], int l, int r, String type) {

        if (l < r) {


            int m = l + (r - l) / 2;


            sort(arr, l, m, type);

            sort(arr, m + 1, r, type);


            merge(arr, l, m, r, type);

        }

    }

    public static List<tvShows> mergeSortNetworkDesc(List<tvShows> arr) {

        int n = arr.size();

        tvShows[] array = arr.toArray(new tvShows[n]);

        MergeSort ob = new MergeSort();

        ob.sort(array, 0, array.length - 1, "Network");

        List<tvShows> sorted = Arrays.asList(array);

        return sorted;

    }

    public List<tvShows> mergeSortEpisodeAsc(List<tvShows> arr) {

        int n = arr.size();

        tvShows[] array = arr.toArray(new tvShows[n]);

        MergeSort ob = new MergeSort();

        ob.sort(array, 0, array.length - 1, "Episodes");

        List<tvShows> sorted = Arrays.asList(array);
        return sorted;
    }

}



