package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.RestMapping;
import spittr.data.Spitter;
import spittr.data.SpitterRepository;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

    @Test
    public void shouldShowRegistrationForm() throws Exception {
        SpitterController controller = new SpitterController(mock(SpitterRepository.class));
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get(RestMapping.SPITTER + "/register"))
                .andExpect(view().name("registrationForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        final String firstName = "Jack";
        final String lastName = "Bauer";
        final String username = "jbauer";
        final String password = "24hours";

        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter(username, password, firstName, lastName);
        Spitter saved = new Spitter(24L, username, password, firstName, lastName);
        when(mockRepository.save(unsaved)).thenReturn(saved);

        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post(RestMapping.SPITTER + "/register")
                .param("firstName", firstName)
                .param("lastName", lastName)
                .param("username", username)
                .param("password", password))
                .andExpect(redirectedUrl(RestMapping.SPITTER + "/" + username));

        verify(mockRepository, atLeastOnce()).save(unsaved);
    }

}
