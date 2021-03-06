package org.vaadin.vol.client;

import com.vaadin.shared.ui.Connect;

import org.vaadin.vol.XYZLayer;
import org.vaadin.vol.client.ui.VXYZLayer;

@Connect(XYZLayer.class)
public class XYZLayerConnector extends LayerBaseConnector {

    @Override
    public XYZLayerState getState() {
        return (XYZLayerState)super.getState();
    }

    @Override
    public VXYZLayer getWidget() {
        return (VXYZLayer)super.getWidget();
    }
}
