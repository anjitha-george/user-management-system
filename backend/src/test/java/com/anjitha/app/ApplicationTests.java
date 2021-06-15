package com.anjitha.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {

  @Autowired
   MockMvc mvc;

  @Test
  public void createUser() throws Exception {

    this.mvc
      .perform(
        post("/users")
          .contentType(MediaType.APPLICATION_JSON)
          .content("{\"name\": \"Mary Thomas\", \"age\":\"11\"}")

      )
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.name", is("Mary Thomas")));
  }

  //delete user functionality
  @Test
  public void deleteUser() throws Exception {
    this.mvc
      .perform(
        delete("/users/John Mathew")
      )
      .andExpect(status().isOk());
  }

  //get users functionality
  @Test
  public void getUsers() throws Exception {

    this.mvc.perform(get("/users")
      .contentType(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$", hasSize(2)))
      .andExpect(jsonPath("$[0].name", is("Joseph Thomas")));

  }

  public static String asJsonString(final Object obj) {
    try {
      return new ObjectMapper().writeValueAsString(obj);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
