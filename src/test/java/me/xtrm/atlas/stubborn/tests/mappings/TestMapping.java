package me.xtrm.atlas.stubborn.tests.mappings;

import me.xtrm.atlas.annotations.mapping.Map;

@Map({"me/xtrm/test/TargetClass", "me/xtrm/TestTargetClass"})
public interface TestMapping {
    @Map
    int
}
