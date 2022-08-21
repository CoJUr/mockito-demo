package com.example.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
//        dataServiceMock.getAllData() => new int[]{24, 15, 3};
        when(dataServiceMock.getAllData()).thenReturn(new int[]{24, 15, 3});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        DataService dataServiceMock = mock(DataService.class);
//        dataServiceMock.getAllData() => new int[]{24, 15, 3};
        when(dataServiceMock.getAllData()).thenReturn(new int[] { 15 });
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }


//    @InjectMocks
//    SomeBusinessImpl business;
//
//    @Mock
//    SomeDataService dataServiceMock;
//
//    @Test
//    public void calculateSumUsingDataService_basic() {
//        when(dataServiceMock.getAllData()).thenReturn(new int[]{1, 2, 3});
//        assertEquals(6, business.calculateSumUsingDataService());
//    }
//
//    @Test
//    public void calculateSumUsingDataService_oneValue() {
//        when(dataServiceMock.getAllData()).thenReturn(new int[] {5 });
//        assertEquals(5, business.calculateSumUsingDataService());
//    }

}


