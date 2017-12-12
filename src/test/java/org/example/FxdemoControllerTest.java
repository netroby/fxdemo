package org.example;

import griffon.core.artifact.ArtifactManager;
import griffon.core.test.GriffonUnitRule;
import griffon.core.test.TestFor;
import org.junit.Rule;
import org.junit.Test;

import javax.inject.Inject;

import static org.awaitility.Awaitility.await;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

@TestFor(FxdemoController.class)
public class FxdemoControllerTest {
    static {
        // force initialization JavaFX Toolkit
        new javafx.embed.swing.JFXPanel();
    }

    @Inject
    private ArtifactManager artifactManager;

    private FxdemoController controller;

    @Rule
    public final GriffonUnitRule griffon = new GriffonUnitRule();

    @Test
    public void executeClickAction() {
        // given:
        FxdemoModel model = artifactManager.newInstance(FxdemoModel.class);
        controller.setModel(model);

        // when:
        controller.invokeAction("click");
        await().atMost(2, SECONDS);

        // then:
        assertEquals("1", model.getClickCount());
    }
}
