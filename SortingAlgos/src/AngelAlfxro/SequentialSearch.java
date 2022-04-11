//package AngelAlfxro;
import AngelAlfxro.tvShows;

import java.util.ArrayList;

import java.util.List;

public class SequentialSearch {
    public List<tvShows> showsEqual2Seasons(List<tvShows> arr) {

        List<tvShows> finalList = new ArrayList<tvShows>();

        for (tvShows s : arr) {

            if (s.getSeasons() == 2) {

                finalList.add(s);

            }

        }

        return finalList;

    }

    public List<tvShows> showsMoreThan100Eps(List<tvShows> arr) {

        List<tvShows> finalList = new ArrayList<tvShows>();

        for (tvShows s : arr) {

            if (s.getNumEpisodes() > 100) {

                finalList.add(s);

            }

        }

        return finalList;

    }
}
