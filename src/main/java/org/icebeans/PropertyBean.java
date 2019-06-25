package org.icebeans;

import java.beans.PropertyChangeListener;

public interface PropertyBean extends Cloneable {
    void addPropertyChangeListener(PropertyChangeListener listener);
    void removePropertyChangeListener(PropertyChangeListener listener);
}
