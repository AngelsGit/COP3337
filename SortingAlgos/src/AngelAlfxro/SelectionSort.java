//package AngelAlfxro;

import AngelAlfxro.tvShows;

import java.util.List;

import java.util.Arrays;

public class SelectionSort {

    public List<tvShows> selSortYearAsc(List<tvShows> arr) {

        int n = arr.size();

        tvShows[] array = arr.toArray(new tvShows[n]);

        for (int i = 0; i < n - 1; i++) {


            int min_idx = i;

            for (int j = i + 1; j < n; j++)

                if (array[j].getYear() < array[min_idx].getYear())

                    min_idx = j;


            tvShows temp = array[min_idx];

            array[min_idx] = array[i];

            array[i] = temp;

        }

        List<tvShows> sorted = Arrays.asList(array);

        return sorted;

    }

    public List<tvShows> selSortGenreDesc(List<tvShows> arr) {

        int n = arr.size();

        tvShows[] array = arr.toArray(new tvShows[n]);

        for (int i = 0; i < n - 1; i++) {


            int min_idx = i;

            for (int j = i + 1; j < n; j++)

                if (array[j].getGenre().compareTo(array[min_idx].getGenre()) < 0)

                    min_idx = j;


            tvShows temp = array[min_idx];

            array[min_idx] = array[i];

            array[i] = temp;

        }

        List<tvShows> sorted = Arrays.asList(array);

        return sorted;

    }

}
