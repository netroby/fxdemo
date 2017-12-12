import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "fxdemo")
                .e("startupGroups", asList("fxdemo"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("fxdemo", map()
                    .e("model", "org.example.FxdemoModel")
                    .e("view", "org.example.FxdemoView")
                    .e("controller", "org.example.FxdemoController")
                )
            );
    }
}