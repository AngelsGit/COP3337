//package AngelAlfxro;
import AngelAlfxro.tvShows;

import java.util.List;

public class InsertionSort {

    public List<tvShows> insSortAsc(List<tvShows> ar) {

        int inner, outer;

        tvShows tempValue;

        for (outer = 1; outer < ar.size(); outer++)

        {

            tempValue = ar.get(outer);

            inner = outer;

            while (inner > 0 && ar.get(inner - 1).getName().compareTo(tempValue.getName()) > 0) {

                ar.set(inner, ar.get(inner - 1));

                --inner;

            }

            ar.set(inner, tempValue);

        }

        return ar;

    }

    public List<tvShows> insSortDescSeasons(List<tvShows> ar) {

        int inner, outer;

        tvShows tempValue;

        for (outer = 1; outer < ar.size(); outer++)

        {

            tempValue = ar.get(outer);

            inner = outer;

            while (inner > 0 && ar.get(inner - 1).getSeasons() < tempValue.getSeasons()) {

                ar.set(inner, ar.get(inner - 1));

                --inner;

            }

            ar.set(inner, tempValue);

        }

        return ar;

    }

}

