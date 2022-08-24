package com.example.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import com.example.mockito.mockitodemo.model.Item;

public class SomeBusinessStubTest {
    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}



//create a stub data service
class DataServiceStub implements DataService {

    @Override
    public int[] getAllData() {
        return new int[] {24, 6, 15};
    }
}
