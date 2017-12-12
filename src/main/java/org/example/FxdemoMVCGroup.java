package org.example;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("fxdemo")
public class FxdemoMVCGroup extends AbstractTypedMVCGroup<FxdemoModel, FxdemoView, FxdemoController> {
    public FxdemoMVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}