//package AngelAlfxro;

import AngelAlfxro.tvShows;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.lang.Math;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("tv_shows.csv");
        Scanner s = new Scanner(fr);
        String firstLine = s.nextLine();
        List<String> categories = Arrays.asList(firstLine.split(","));
        int numberCategories = categories.size();
        System.out.println();
        System.out.println(categories);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println();

        tvShows[] myShows = new tvShows[20];

        for(int i = 0; i < 20; i++){
            String showInfo = s.nextLine();
            String [] tvArray1 = showInfo.split(",");
            tvShows show = new tvShows(tvArray1);
            myShows[i] = show;

        }

        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println();

        // merge Sort below
        MergeSort ms = new MergeSort();
        List<tvShows> merSortNetworkList = MergeSort.mergeSortNetworkDesc(Arrays.asList(myShows));
        System.out.println(merSortNetworkList);

        //selection sort
        SelectionSort selectionSort = new SelectionSort();
        List<tvShows> selSortYearList = selectionSort.selSortYearAsc(Arrays.asList(myShows));
        System.out.println(selSortYearList);
        List<tvShows> selSortGenreList = selectionSort.selSortGenreDesc(Arrays.asList(myShows));
        System.out.println(selSortGenreList);

        // Insertion sort
        InsertionSort ins = new InsertionSort();
        List<tvShows> insAscNamesList = ins.insSortAsc(Arrays.asList(myShows));
        System.out.println(insAscNamesList);
        List<tvShows> insDescSeasonsList = ins.insSortDescSeasons(Arrays.asList(myShows));
        System.out.println(insDescSeasonsList);

        // Sequential sort
        SequentialSearch seqSearch = new SequentialSearch();
        System.out.println("Number of shows that lasted for 2 years: " + seqSearch.showsEqual2Seasons(Arrays.asList(myShows)));
        System.out.println("Number of shows having more than 100 episodes" + seqSearch.showsMoreThan100Eps(Arrays.asList(myShows)));


        /*

       tv show object - instance variables, male lead, female lead etc
       possible: scanner delimiter

       save the data in an array and later change the int elements to an int and sort that way.

       System.out.println(myShows[2]);

       */
    }




}
