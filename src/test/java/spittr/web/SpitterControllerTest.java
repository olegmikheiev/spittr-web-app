package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.RestMapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

    @Test
    public void shouldShowRegistrationForm() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get(RestMapping.SPITTER + "/register"))
                .andExpect(view().name("registrationForm"));
    }

}
