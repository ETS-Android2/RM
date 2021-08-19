package jmini3d.demo.gvr;

import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.HeadTransform;

import jmini3d.Renderer3d;

interface VRScreenController {

    boolean onNewFrame(HeadTransform headTransform, boolean forceRedraw);

    void render(Eye eye, Renderer3d renderer3d);

}