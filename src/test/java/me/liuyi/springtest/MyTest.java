package me.liuyi.springtest;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MyTest {


    @Mock
    private List mockedList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }





    @Test
    public void test() {



        mockedList.get(1);
        mockedList.get(1);
        mockedList.get(1);
        mockedList.get(1);


        verify(mockedList, times(4)).get(1);
        
    }
    
}
