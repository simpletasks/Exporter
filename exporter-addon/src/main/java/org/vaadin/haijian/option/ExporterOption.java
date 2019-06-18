package org.vaadin.haijian.option;

import java.util.HashMap;
import java.util.Map;

public class ExporterOption {
    private Map<String, ColumnOption> columnOptions;
    private boolean useItemProperties;

    public ColumnOption getColumnOption(String columnKey) {
        getColumnOptions().putIfAbsent(columnKey, new ColumnOption());
        return getColumnOptions().get(columnKey);
    }

    private Map<String, ColumnOption> getColumnOptions() {
        if (columnOptions == null) {
            columnOptions = new HashMap<>();
        }
        return columnOptions;
    }

    public boolean isUseItemProperties() {
        return useItemProperties;
    }

    public void setUseItemProperties(boolean useItemProperties) {
        this.useItemProperties = useItemProperties;
    }
}
