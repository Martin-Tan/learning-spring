package com.vagrant.demo.mavendemo.indepencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchService {
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchService(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
        System.out.println(sortAlgorithm);
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // sort numbers
        numbers = sortAlgorithm.sort(numbers);

        return 3;
    }
}
