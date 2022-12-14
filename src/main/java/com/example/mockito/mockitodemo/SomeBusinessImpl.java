package com.example.mockito.mockitodemo;

public class SomeBusinessImpl {

    private DataService dataService;

    int findTheGreatestFromAllData() {
        int[] data= dataService.getAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if(value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }


}


