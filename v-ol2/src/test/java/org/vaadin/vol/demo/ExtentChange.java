package org.vaadin.vol.demo;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;

import org.vaadin.vol.OpenLayersMap;
import org.vaadin.vol.OpenLayersMap.ExtentChangeEvent;
import org.vaadin.vol.OpenStreetMapLayer;

public class ExtentChange extends AbstractVOLTest {

    @Override
    public String getDescription() {
        return "This example shows how to use extent change listener.";
    }

    @Override
    Component getMap() {
        final OpenLayersMap map = new OpenLayersMap();
        map.setSizeFull();
        map.addLayer(new OpenStreetMapLayer());

        // This will make map report all moves and zooms eagerly to server. If
        // kept as false, extent change listener will be notified lazily when
        // other communicatin to server would occur.
        map.setImmediate(true);

        map.addExtentChangeListener(new OpenLayersMap.ExtentChangeListener() {
            public void extentChanged(ExtentChangeEvent event) {
                Notification.show(
                        "Current extent is: "
                                + event.getComponent().getExtent());

                // In real world cases developer could e.g. update drawn vectors
                // on map

            }
        });

        return map;
    }

}
