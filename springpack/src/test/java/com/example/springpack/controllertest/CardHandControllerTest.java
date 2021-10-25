package com.example.springpack.controllertest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.awt.*;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CardHandControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void showHandTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/showHand")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void showSortedTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/sortedHand")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void resetTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/reset")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string((equalTo("The game has been reset, you will get a new card strength order"))));
    }
}
