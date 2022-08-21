package com.example.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;

    @Mock
    private ItemRepository repository;

    @Test
    public void getAllItems_basic() {
        when(repository.findAll()).thenReturn(Arrays.asList(new Item(2, "Item2", 10, 10),
                new Item(3, "Item3", 20, 20)));
        List<Item> items = business.getAllItems();

        assertEquals(100, items.get(0),getValue());
        assertEquals(400, items.get(1),getValue());

    }


}
